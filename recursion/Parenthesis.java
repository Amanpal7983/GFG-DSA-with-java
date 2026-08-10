
package recursion;

import java.util.Scanner;

public class Parenthesis {

    static void parenthe(int open ,int close , String str , int n){

        if(str.length() == 2*n){
            System.out.println(str);

            return;
        }

        if(open<n) parenthe(open +1, close, str + '(', n);
        if(close<open) parenthe(open, close+1, str+ ')', n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        parenthe(0,0,"" , n);
    }
}
