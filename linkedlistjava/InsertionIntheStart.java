package linkedlistjava;
// insert the element at the starting of the linked list

class LinkedList {
    Node head;
    @SuppressWarnings("unused")
    Node tail;
    int size;

    void add(int val) {

        Node temp = new Node(val);

        if (head == null) { // LL is empty
            head = tail = temp;
        }

        else {     // not empty
            temp.next = head;
            head = temp;
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

    void size() {
        System.out.println("The size of the Linked list is:" + size);
    }
}

public class InsertionIntheStart {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
      

        


        list.add(34);
        list.add(35);
        list.add(36);
        list.add(37);

        list.size();
        list.print();

    }

}
