package arrraays;

public class KadaneAlgo {

    static int maxSum(int[] arr) {
        int current = arr[0];
        int max = arr[0];
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            current = Math.max(arr[i], current + arr[i]);

            max = Math.max(max, current);
        }

       return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, -1, -2, 8, 6, -7, 9, 3, -2};
        System.out.println(maxSum(arr));
    }
}
