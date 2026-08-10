package recursion;
public class BinarySearch {

    static int search(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; 
        }else if (arr[mid] > target) {
            return search(arr, target, low, mid - 1); 
        }else {
            return search(arr, target, mid + 1, high);
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 25, 12, 54, 123, 87, 67, 56};
        int target = 54;

        int n = arr.length;

        System.out.println(search(arr, target, 0, n - 1));
    }
}
