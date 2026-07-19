package linkedlistjava;


class Node{

    int val;
    Node next;

    Node( int val){
        this.val= val;
    }



}

public class Link {
    public static void main(String[] args) {

        Node one = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);

        one.next = two;   // link one -> two
        two.next = three;  // link  one ->two -> three
        three.next = four;  // line one->two-> three->four
        four.next = five;   // next value null



        System.out.println(one.val);
        System.out.println(one.next.val);
        System.out.println(one.next.next.val);
        System.out.println(one.next.next.next.val);
        System.out.println(one.next.next.next.next.val);
        // System.out.println(one.next.next.next.next.next.val); gives erroe because next of five is null

        //  System.out.println(one.next);
        //  System.out.println(two);
        // System.out.println(two);
        // System.out.println(two.val);
        // System.out.println(two.next);

        
    }
}
