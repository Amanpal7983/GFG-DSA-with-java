import java.util.Scanner;

public class TowerOfHanoi {

    static void hanoi(int n, char a , char b ,char c){

        if(n==0) return;

        // move n=1 disks from A to B via C
        hanoi(n-1,a,c,b);

        // move largest from A to C

        System.out.println(a+ "->"+ c);

        // move n-1 from B to C via help of A
        hanoi(n-1,b,a,c);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of disk:");
        int n = sc.nextInt();

        hanoi(n,'A','B','C');
        
    }
}
