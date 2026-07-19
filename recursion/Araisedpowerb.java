
// calculaate the power ( a ki power b)
import java.util.Scanner;

public class Araisedpowerb {

    static int pow(int a, int b) {
        if (b == 0) {
            return 1;

        }

        int ans = pow(a, b / 2);
        if (b % 2 == 0) {
            return ans * ans;
        }
        return ans * ans * a;

    }

    // slow method

    // static int pow(int n, int b) {
    // if (b == 0) {
    // return 1;
    // }

    // return n * pow(n, b-1);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = pow(a, b);

        System.out.println(ans);
    }
}
