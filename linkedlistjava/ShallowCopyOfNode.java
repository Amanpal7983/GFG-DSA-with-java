package linkedlistjava;
//using temp node


// class Node{
//     int val;
//     Node next;

//     Node(int val){
//         this.val = val;
//     }
// }
public class ShallowCopyOfNode {


    static void recursivePrint( Node temp){
        if(temp == null){
            return;
        }
        System.out.println(temp.val);
        recursivePrint( temp.next);
    }

    // static void print( Node head){
    //     Node temp = head;

    //     while(temp != null){
    //         System.out.println(temp.val);
    //         temp = temp.next;
    //     }
    // }
    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next =d;
        d.next =e;

        // print(a);

        Node temp = a;
        recursivePrint(temp);



        // Node temp = a;

        // for(int i = 1; i<=5;i++){
        //     System.out.println(temp.val);
        //     temp = temp.next;
        // }

        // System.out.println(temp.val);
        // temp = temp.next;
        // System.out.println(temp.val);

        // Node temp = a;    shallow copy of a (both are points the same location/have same adrress)
        // Node temp = new Node(100); // new object create
        // System.out.println(a);
        // System.out.println(temp);

        
    }
}
