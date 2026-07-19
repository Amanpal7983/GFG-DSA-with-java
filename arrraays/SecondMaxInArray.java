package arrraays;
public class SecondMaxInArray {
    // Find the second max element in the Array:

    static void secondMax(int[] arr){
        int max= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        int SecMax = arr[0];
        for(int j = 0;j<arr.length;j++){
            if(arr[j]>SecMax && arr[j]!=max){
                SecMax = arr[j];

            }
        }
        System.out.println("The second max element in the Array is:"+SecMax);

    }


    public static void main(String[] args) {
        int[] arr = {34,54,12,21,32,23,76,98};
        secondMax(arr);

        
    }
}
