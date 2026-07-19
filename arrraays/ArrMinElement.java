package arrraays;
public class ArrMinElement {
    public static void main(String[] args) {
        int[] arr = {34,64,87,45,3,23,11,456};

        int min = arr[0];

        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
