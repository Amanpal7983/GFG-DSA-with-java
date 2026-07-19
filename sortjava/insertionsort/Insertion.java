package sortjava.insertionsort;

public class Insertion {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 4, 3, -98, 1, 9};

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {

                    // swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }

            }

        }

        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}


