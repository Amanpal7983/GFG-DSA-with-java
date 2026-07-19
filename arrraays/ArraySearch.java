package arrraays;

public class ArraySearch {
    // Search the element in the current Array


    static void search(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                System.out.println("Element is present in the Array at index:" + i);
                break;
            }

            if(i==arr.length-1 && arr[i]!=target){
                System.out.println("Element is not present in the Array:");
            }
            
        }

        // Second method is using the boolean variable and print if true else false:

        

    }
    public static void main(String[] args) {

        int[] arr= {3,5,2,53,65,23,12,21,343,98};

        int target = 101;

        search(arr,target);
        
    }
}
