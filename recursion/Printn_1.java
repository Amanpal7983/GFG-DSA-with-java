package recursion;

import java.util.Scanner;

public class Printn_1 {

    static void printNumber(int n) {

        if (n == 0) {

            return;
        }

        System.out.println(n);
        printNumber(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number:");
        int n = sc.nextInt();

        printNumber(n);

    }
}
