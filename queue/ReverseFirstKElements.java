package queue;

import java.util.*;

public class ReverseFirstKElements {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int k = 3;
        int n = q.size();
        Stack<Integer> st = new Stack<>();

        //remove k elemnets in the queue
        for (int i = 1; i <= k; i++) {
            st.push(q.remove());

        }
        //add in queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        //add and remove n-k elements
        for (int i = 1; i <= n - k; i++) {
            q.add(q.remove());
        }

        System.out.println(q);
    }
}
