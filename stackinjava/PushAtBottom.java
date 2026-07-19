package stackinjava;

import java.util.Stack;

public class PushAtBottom {

    static void push(Stack<Integer> st , int val){
        if(st.size() ==0){
            st.push(val);
            return;
        }
        int ele =st.pop();
        push(st, val);
        st.push(ele);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println("stack at starting:" + st);

        push(st,50);
        System.out.println(st);

    }
}
