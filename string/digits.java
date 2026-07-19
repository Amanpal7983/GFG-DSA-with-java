package string;

import java.util.Scanner;
// total digits in number


public class digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = "" + n ;
        System.out.println(s);

        System.out.println(s.length());
    }
}

// another method for change integer to int 

// string s= Integer.toString(n);