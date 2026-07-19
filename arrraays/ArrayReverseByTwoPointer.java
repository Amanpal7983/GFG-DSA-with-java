package arrraays;

import java.util.Arrays;

public class ArrayReverseByTwoPointer{
    public static void main(String[] args) {

        int[] arr = { 3,5,2,65,34,12,65,43,643};
        int n = arr.length-1;

        int i = 0;
        int j= n;

        while(i<j){

            int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             i++;
             j--;
        }

        System.out.println(Arrays.toString(arr));
        
    }
}