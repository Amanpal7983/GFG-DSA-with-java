package arrraays;
import java.util.Scanner;

public class ArrayIO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] arr = new int[4];

        for(int i = 0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]*2);

        }
        sc.close();

    }
    
}
