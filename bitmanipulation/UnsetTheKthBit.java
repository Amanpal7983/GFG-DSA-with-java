package bitmanipulation;

public class UnsetTheKthBit {
    public static void main(String[] args) {
        int n =230;
        int k =2;

        n = ( n & (~(1<<k)));
        System.out.println(n);
    }
}
