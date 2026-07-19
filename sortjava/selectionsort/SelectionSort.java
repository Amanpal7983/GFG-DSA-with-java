package sortjava.selectionsort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= { 5,6,7,4,3,2,1,9};

        int n = arr.length;

        for(int i=0;i<n-1;i++){

            int min= Integer.MAX_VALUE;
            int mindx=-1;

            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;

                }
                // swap the elements

               
            }
             int temp = arr[i];
                arr[i]= arr[mindx];
                arr[mindx] = temp;
        }

        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
