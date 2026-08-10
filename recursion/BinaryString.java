package recursion;

import java.util.Scanner;

public class BinaryString {

    static void binary(String str , int n) {

        int m = str.length();

        if(m == n){
            System.out.println(str);
            return;
        }

        if( m ==0 || str.charAt(m-1) == '0'){

            binary(str + '1', n);
            binary(str + '0', n);
        }
        else{
            binary(str + '0', n);
        }
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        binary("" , n);

    }
   
}
