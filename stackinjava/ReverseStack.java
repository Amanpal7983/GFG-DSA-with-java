package stackinjava;

import java.util.Stack;

public class ReverseStack {
    static void reverse(Stack<Integer> st){
        if(st.size() <=0){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }

    static void pushAtBottom(Stack<Integer> st , int ele){
        if(st.size() == 0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, ele);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        reverse(stack);
        System.out.println(stack);
      
    }
}
