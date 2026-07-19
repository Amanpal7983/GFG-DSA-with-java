package stackinjava;
import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        System.out.println(stack.size());

        Stack<Integer> stack2 = new Stack<>();
        while(stack.size() >0){
          
          stack2.push(stack.pop());
        }

        System.out.println(stack2);
        System.out.println(stack.isEmpty());
        System.out.println(stack);

    }
}
