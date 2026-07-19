import java.util.Scanner;

public class Staripath {
    static int stairPath(int n) {

        if(n<=2){
            return n;
        }


     return stairPath(n-1) + stairPath(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = stairPath(n);
        System.out.println(ans);
    }
}
