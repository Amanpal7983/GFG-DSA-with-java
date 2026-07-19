package string;


import java.util.Scanner;


public class basics {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        
        String str;

       // str = sc.next(); // only input first latter
       // str = sc.nextLine(); // print whole world

        String s = "Aman pal";

        // find the length of the string
        int n = s.length();
        System.out.println(n);

        // find the character at 
        System.out.println(s.charAt(7));

        System.out.println("Hi i am" + 10 + 20);// answer is Hi i am1020

        
    }
}
