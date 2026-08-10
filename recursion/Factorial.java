package recursion;
import java.util.Scanner;

public class Factorial {

    static int fact(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        int ans = n * fact(n - 1);
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number:");
        int n = sc.nextInt();

         int ans = fact(n);
        System.out.println("Your factorial is " + ans);
    }
}
