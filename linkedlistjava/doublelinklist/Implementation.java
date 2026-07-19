package linkedlistjava.doublelinklist;


class DoublyNode{
    int val;
    DoublyNode next;
    DoublyNode prev;
    int size;

     DoublyNode(int val) {
        this.val=val;
    }
    
}

public class Implementation {

    // print all elements of doubly linked list
    static void print(DoublyNode head){
        DoublyNode temp = head;
        while(temp !=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // print all elements in reverse order
    static void printReverse(DoublyNode tail){
        DoublyNode temp = tail;
        while(temp !=null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    
    // agar koi random node di hai aur usse sabhi ele ko print karna hai to
    // pahle head ko find karo fir head wale se print kara do
    static void display(DoublyNode node){
        DoublyNode temp = node;
        while(temp.prev !=null){
            temp = temp.prev;
        }
        // now temp is point at head
        print(temp);


      
    }
    public static void main(String[] args) {

        DoublyNode a = new DoublyNode(10);
        DoublyNode b = new DoublyNode(20);
        DoublyNode c = new DoublyNode(30);
        DoublyNode d = new DoublyNode(40);

        a.next =b; a.prev = null;
        b.next = c; b.prev = a;
        c.next = d; c.prev= b;
        d.next = null; d.prev=c;

        print(a);
        printReverse(d);
        display(c);

        
    }
}
