package arrraays;
public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {34,53,534,4,35,34,76,4,987};

        int sum = 0;
        for(int i = 0; i<arr.length;i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
