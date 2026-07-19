package linkedlistjava;

// reverse the element of the linked list

// class Node{
//     Node next;
//     int val;
//     Node(int val){
//         this.val = val;
//     }
// }

public class ReverseAnLinkedList {

    static Node reverseList(Node head){
        Node prev = null;
        Node curr = head;

        while( curr !=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;


    }

    static void print(Node head){
        Node temp= head;
        while(temp!= null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(50);
        Node b = new Node(40);
        Node c = new Node(30);
        Node d = new Node(20);
        Node e = new Node(10);

        a.next = b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next = null;

         Node newNode = reverseList(a);
         print(newNode);
       
        
    }

}
