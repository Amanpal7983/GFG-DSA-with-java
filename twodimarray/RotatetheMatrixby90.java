package twodimarray;

//same array me changes karne hai

//first transpose the matrix than reverse each row in the matrix


public class RotatetheMatrixby90 {
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
        // now swap the rows

       
        for(int i=0;i<m;i++){
             int a= 0;
             int b = m-1;

             while(a<=b){
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];

                arr[i][b] = temp;
              a++; b--;
               
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
