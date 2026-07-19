package quicksort;

public class Quick {

    static void quick(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(arr, start, end); // isse pivot element ka sahi index milega

        //left side array
        quick(arr, start, pivot - 1);

        //right side array
        quick(arr, pivot + 1, end);

    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end]; // last element is pivot
        int position = start;

        for (int i = start; i < end; i++) {

            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[position];
                arr[position] = temp;
                position++;
            }

        }
        int temp = arr[position];
        arr[position] = arr[end];
        arr[end] = temp;
        return position;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 6, 12, 9, 4, 2};
        int n = arr.length - 1;

        quick(arr, 0, n);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
