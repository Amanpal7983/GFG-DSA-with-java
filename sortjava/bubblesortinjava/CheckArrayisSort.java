package sortjava.bubblesortinjava;
import java.util.Arrays;

public class CheckArrayisSort {
    public static void main(String[] args) {
       int[] arr={2,4,5,6,7,9};

       boolean sort = true;


       for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){

            if(arr[i]>arr[j]){
                sort=false;
                break;
            }
        }
       }
       if(sort){
        System.out.println("Array is sorted");
       }
       else{
        System.out.println("Array is not sorted");
       }

       //inbuilt fun to sort a array

       int[] b={3,5,2,64,6,31,78,9};
       Arrays.sort(b);

       for(int ele:b){
        System.out.print(ele + " ");
        
       }
    }
}
