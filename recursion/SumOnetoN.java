package recursion;


import java.util.Scanner;

public class SumOnetoN {

    static int  printsum(int n){

        if(n==1){
            return 1;
        }

        return n + printsum(n-1);
    }
     // second method
     
    // static void  printsum(int n, int sum) {

    //     if (n== 0) {
    //         System.out.println(sum);
    //         return ;

    //     }
    //     printsum(n-1, sum+n);
        
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");

        int n = sc.nextInt();
        int sum = 0;

          int ans = printsum(n);
          System.out.println(ans);

       ;
    }
}
