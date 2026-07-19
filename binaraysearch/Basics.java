package binaraysearch;

public class Basics {

    static boolean bs(int[] arr, int target){

        int low=0;
        int high = arr.length-1;
       

        boolean flag = false;

        while(low<=high){
            int mid = (low+high)/2;
            if(mid<target){
                low = mid +1;

            }
            else if(mid>target){
                high = mid-1;
            }
            else{
                flag = true;
                return flag;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr= { 3,4,5,6,7,8,9,10,22,33,44,66};
        int target= 44;

        int n = arr.length;
        System.out.println(n);

        boolean x = bs(arr,target);

        System.out.println(x);
        
    }
}
