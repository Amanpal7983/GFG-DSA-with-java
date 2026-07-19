package arrraays;

import java.util.Arrays;

// isme array sorted diya rahta hai aur hame elements ko is tarah arrange karna padta  hai ki ek wave like struture create ho jaye
public class ArrayWave {
    static void wavetheArray(int[] arr){
        int i= 0;
        int j=1;

        while(i<j &&j!=arr.length&&i!=arr.length){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;

            i+=2;
            j+=2;
            

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,12,67,100,111};

        wavetheArray(arr);
    }

}
