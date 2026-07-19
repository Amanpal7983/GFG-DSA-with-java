package twodimarray;

//transpose ko same array me hi replace karna hai

public class TransposeInSameArray {
    public static void main(String[] args) {
        int[][] arr= {{5,7,12},{7,57,45},{4,5,23}};

        int n= arr.length;
        int m= arr[0].length;

        for(int i = 0;i<n;i++){
            for(int j=0; j<=i;j++){

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];

                arr[j][i] = temp;
            }
        }

        
           
        
         for(int[] ele: arr){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }


    }
}
