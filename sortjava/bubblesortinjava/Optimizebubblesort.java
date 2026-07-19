package sortjava.bubblesortinjava;
import java.util.Arrays;

public class Optimizebubblesort {
    public static void main(String[] args) {

        int[] arr ={3,4,64,23,9,87,1,233,45};

        int noOfPasses = arr.length;

        for(int i=0;i<noOfPasses-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                 if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            boolean b= true;
            for(int k=0;k<arr.length-1;k++){
                for(int f=k+1;f<arr.length;f++){
                    if(arr[k]>arr[f]){
                        b=false;
                    }
                }
            }

            if(b==true){
                break;
            }
            
        }

        System.out.println(Arrays.toString(arr));

        
    }
}
