package arrraays;
// import java.util.Scanner;

public class PrintNegativeNumbers {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        int[] arr = {4,-3,98,-54,-65,345,95,-8};

        for(int i= 0;i<arr.length;i++){
            if(arr[i]<0)
            System.out.println(arr[i]);
        }

        
    }
}
