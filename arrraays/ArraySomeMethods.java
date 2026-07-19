package arrraays;
import java.util.Arrays;

public class ArraySomeMethods {
    public static void main(String[] args) {
        int[] arr = {34,6,2,76,45,1};
        
        // Create a copy of array

        int[] copyArray= Arrays.copyOf(arr,arr.length);
        copyArray[0] =3;
        System.out.println(copyArray[0]);
        System.out.println(arr[0]);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }

}
