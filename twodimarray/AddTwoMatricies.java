package twodimarray;

public class AddTwoMatricies {
    public static void main(String[] args) {
        int[][] arr1 = { { 3,4,3,2},{5,7,1,8}};
        int[][] arr2 = { { 5,6,3,1},{52,71,1,9}};

        int[][] arr = new int[2][4];

        for(int i = 0; i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){

                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x + "  ");
            }
            System.out.println();
        }
    }
    
}
