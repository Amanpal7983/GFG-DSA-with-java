import java.util.Scanner;

public class PrintOnetoN {

static void print(int n){
    if(n==0){
        return;
    }
    print(n-1);

    System.out.println(n);
}


  // SEcond method

    // static void printnum(int n, int target) {
    //     if (n > target) {
    //         return;
    //     }

    //     System.out.println(n);
    //     printnum(n + 1, target);

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number:");
        int n = sc.nextInt();

        print(n);

        // printnum(1, n);

    }
}
