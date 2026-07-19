package linkedlistjava;

// creation of the linked list data struture 
// Insert the element at the end of the link list 

class SingleLL {
    Node  head; // by default null value
     Node  tail; // also null
    int size; // for the measure of the length of linked list

    void InsertAtEnd(int val) {
         Node temp = new  Node(val);

        if (head == null) { // means list is empty both head and tail point at null
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void print() {
         Node temp = head;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

}

public class InsertionEndOfList {

    public static void main(String[] args) {

        SingleLL list = new SingleLL();

        list.InsertAtEnd(10);
        list.InsertAtEnd(15);
        list.InsertAtEnd(120);

        System.out.println( "The size of the linked list is : " + list.size);

        list.print();

    }
}
