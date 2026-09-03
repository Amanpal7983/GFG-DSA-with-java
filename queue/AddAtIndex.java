package queue;

import java.util.LinkedList;
import java.util.Queue;



public class AddAtIndex {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int k = 3;
        int ele = 60;
        int n =q.size();
        
        //remove and add k times
        for(int i=0;i<k;i++){
            q.add(q.remove());
        }

        //insert the element
        q.add(ele);

        // again n-k times remove and add
        for(int i=1;i<=n-k;i++){
            q.add(q.remove());
        }

        System.out.println(q);

    }
}
