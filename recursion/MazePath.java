
package recursion;
import java.util.Scanner;




public class MazePath {
    static int maze(int row, int col,int m, int n) {
        if(row==m || col==n){
            return 1;
        }

        int  rightways = maze(row, col+1, m, n);
        int downways = maze(row+1, col, m, n);

        return  rightways + downways;
        
        

    }

//     static int methodTwo(int m,int n){
//     if(m==1 || n==1){
//         return 1;
//     }

//     return methodTwo(m-1, n)+methodTwo(m, n-1);
// }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int ans = maze(1,1,m,n);
        System.out.println(ans);
    }
}
