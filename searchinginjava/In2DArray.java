package searchinginjava;

public class In2DArray {
    static boolean search(int[][] arr, int target){
        if(arr.length==0){
            return false;
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[][] arr= {{3,4,5},{6,32,1},{7,8,65}};
        int target= 65;

        System.out.println(search(arr,target));
    }
}
