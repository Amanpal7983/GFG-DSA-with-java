package linkedlistjava.doublelinklist;

class Dll {
    DoublyNode head;
    DoublyNode tail;
    int size;

    //size of the doublylist
    void  size(){
        System.out.println(size);
    }

    // display fuction to print all element
    void display() {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // insert element at the end/tail
    void InsertAtEnd(int val) {
        DoublyNode temp = new DoublyNode(val);
        if (size == 0) {
            tail = head = temp;
        }

        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    // insert at start/head
    void InsertAtStart(int val) {
        DoublyNode temp = new DoublyNode(val);
        if (size == 0) {
            head = tail = temp;
        }

        else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }

    // insert at any index
    void add(int val, int idx) {
        if (idx == 0) {
            InsertAtStart(val);
            return;
        }
        if (idx == size) {
            InsertAtEnd(val);
            return;
        }
        if (idx > size) {
            System.out.println("error");
            return;
        }

        DoublyNode temp = new DoublyNode(val);
        DoublyNode x = head;

        for (int i = 1; i <= idx - 1; i++) {
            x = x.next;
        }
        DoublyNode y = x.next;

        x.next = temp;
        temp.prev = x;

        temp.next = y;
        y.prev = temp;

        size++;
    }

    // delete at Head
    void delAtHead() {
        if (size == 0) {
            System.out.println("error");
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    // delete at tail
    void delAtTail() {
        if (size == 0) {
            System.out.println("error");
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    // delete at any index
    void delete(int idx) {
        if (idx == 0) {
            delAtHead();
            return;
        }
        if (idx == size - 1) {
            delAtTail();
            return;
        }
        if (idx < 0 || idx >= size) {
            System.out.println("incorrect index");
            return;
        }
        DoublyNode temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;
        size--;

    }

    // value of element at any index
    int getValue(int idx) {
        if (idx == size - 1) {
            return tail.val;
        }
        if (idx < 0 || idx >= size) {
            System.out.println("incorrect index");
            return -1;
        }
        DoublyNode temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;

        }
        return temp.val;

    }
    
    //set the value of any index
     void setAtIndex(int idx,int val){
        if(idx == size-1){
            tail.val = val;
        }
        if(idx >=size){
            System.out.println("Invalid Index:");
        }

        DoublyNode temp = head;
        for(int i = 1; i<=idx;i++){
            temp = temp.next;
        }
        temp.val=val;
    }
   
}

public class DoublyDataStructure {
    public static void main(String[] args) {

        Dll list = new Dll();

        list.InsertAtEnd(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtEnd(40);
        list.InsertAtEnd(50);
        list.display();

        list.InsertAtStart(5);
        list.display();

        list.add(15, 1);
        list.display();

        // list.delAtTail();
        // list.display();

        // list.delAtHead();
        // list.display();

        list.delete(6);
        list.display();
        System.out.println(list.size);

        System.out.println(list.getValue(4));
        list.size();

        list.setAtIndex(1, 121);
        list.display();

    }
}
