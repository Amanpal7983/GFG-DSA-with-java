package stackinjava;

class Node {

    Node next;
    int val;

    Node(int val) {
        this.val = val;
    }
}

class Stack {

    Node head;
    int size;


     void size(){
        System.out.println(size);
     }

    void push(int val) {
        Node temp = new Node(val);
        if (size == 0) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;

        }

        size++;

    }

    int peek() {
        if (size <= 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return head.val;
    }

    int pop() {
        if (size <= 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }

    void print() {
        if (size <= 0) {
            System.out.println("Stack Underflow:");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}

public class StackUsingLL {

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);

        st.print();
        System.out.println(st.pop());
        System.out.println(st.peek());

        st.size();

    }
}
