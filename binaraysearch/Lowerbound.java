package binaraysearch;

public class Lowerbound {
    static int  lowerboundcheck(int [] arr, int target){

        int low = 0;
        int high=arr.length-1;

        int lb= arr.length;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]>=target){
                lb = Math.min(lb, mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        System.out.println(lb);
        if(lb<=arr.length){
            return lb;
        }
        return -1;

    }

    
    public static void main(String[] args) {
         int[] arr= { 3,4,5,6,7,8,9,10,22,33,44,66};
        int target= 6;

        System.out.println(lowerboundcheck(arr, target));
        

    }
}
