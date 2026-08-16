package arrraays;

public class SlidingWindow {

    static int slide(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];

            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 8, 4, 9, 11};
        int k = 3;
        System.out.println(slide(arr, k));
    }

}
