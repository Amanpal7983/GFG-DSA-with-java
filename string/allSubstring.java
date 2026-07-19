package string;

import java.util.Scanner;

// print all of the substring of the give string

public class allSubstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        java.lang.String s=sc.nextLine();

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j) +" "); // because j is exclusive .

            }
            System.out.println();

        }
        
    }
}
