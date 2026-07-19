package twodimarray;

public class WaveOfMatrix {
    public static void main(String[] args) {
        
         int[][] arr= {{5,7,12},{7,57,45},{4,5,23}};

        int n= arr.length;
        int m= arr[0].length;

        for(int i =0;i<n;i++){

            if(i%2==0){
                for(int j=0;j<m;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            else{
                for(int j=m-1;j>=0;j--){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
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
