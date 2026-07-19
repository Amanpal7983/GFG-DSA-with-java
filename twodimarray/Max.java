package twodimarray;

public class Max {
    public static void main(String[] args) {
        int[][] arr= { { 3,5,44,64},{84,2,1,78} };

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max= arr[i][j];
                }
            }
           
        }

        for(int[] ele:arr){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }

        System.out.println ("largest element is : " + max);

    }
}
