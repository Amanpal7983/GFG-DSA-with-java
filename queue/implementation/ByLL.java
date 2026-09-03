package queue.implementation;

class Node {

    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

}

class linklist {

    Node head;
    Node tail;
    int size;

    void add(int val) {
        Node temp = new Node(val);
        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    int remove() {
        if (size == 0) {
            return -1;
        }

        int data = head.val;
        head = head.next;
        size--;

        return data;
    }

    int peek() {

        if (size == 0) {
            return -1;
        }
        return head.val;
    }

    void print() {
        if (size == 0) {
            System.out.println("queue is empty");
        }

        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

}

public class ByLL {

    public static void main(String[] args) {
        linklist list = new linklist();
        
        //add the elements is the queue
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        //print the elements of the queue
        list.print();
       
        
        //remove the elements of the queue
        System.out.println(list.remove());
       
        
        //peek the elements of the queue
        System.out.println(list.peek());
    }

}
