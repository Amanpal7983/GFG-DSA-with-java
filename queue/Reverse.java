package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        Stack<Integer> st = new Stack<>();

        int n = q.size();
        //add in stack 

        for(int i=0;i<n;i++){
            st.push(q.remove());
        }
        System.out.println(st);

        //now again insert in queue
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
