package arrraays;
public class ArrMaxElement {
    public static void main(String[] args) {
        int[] arr = { 34,64,6,34,645,1,3,4,5,67,765};

        int max= arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max){
                max = arr[i];
            }

            
            
        }
        System.out.println(max);
    }
}
