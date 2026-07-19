package arrraays;
public class MissingInArray {

    static int missing(int[] arr) {

        int n = arr.length + 1;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        int sumArray = 0;
        for (int j = 0; j < arr.length; j++) {
            sumArray += arr[j];
        }

        return sum - sumArray;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 4, 2, 3, 6 };
        int ans = missing(arr);
        System.out.print(ans);

    }
}
