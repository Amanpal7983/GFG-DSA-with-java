package sortjava.bubblesortinjava;

public class Bubble {
    public static void main(String[] args) {
        
        int[] arr={ 5,4,3,2,1};

        int noOfPasses= arr.length;

        for(int i=1;i<noOfPasses;i++){
            for(int j=0;j<arr.length-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int ele:arr){
            System.out.print(ele+ " ");
        }

        //for more better code

        // for(int i=0;i<noOfPasses-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //          if(arr[j]>arr[j+1]){
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }


        
    }
}
