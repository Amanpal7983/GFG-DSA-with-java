package twodimarray;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr= new int[4][4];

        // for(int i=0;i<arr.length;i++){
        //     for(int j = 0;j<arr[i].length;j++){
        //         arr[i][j] = sc.nextInt();

        //     }
        // }

        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
        // for each loop for two dimensionl array

        // for(int[] a:arr){
        //     for(int ele:a){
        //         System.out.print(ele + " "  );
        //     }
        //     System.out.println();
        // }
    }
    
}
