package arrraays;
import java.util.Arrays;


public class ArrayQuestion2 {
    // Multiply odd indexed elements by 2 and add 10 to each even indexed elements



     static void perform(int[] arr){
        for(int i =0;i<arr.length;i++){
        
        if( i%2!=0){
            arr[i] = arr[i]*2;

        }
        else{
            arr[i] = arr[i] + 10;

        }

    }
    System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr = { 34,64,643,1,2,34,32,12,65,44};

        perform(arr);

        


    }
}
