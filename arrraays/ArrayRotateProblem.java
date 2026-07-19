
package arrraays;
public class ArrayRotateProblem {

    // rotate means if arr= {3,43,5,23,53,11} and rotation d = 2 then new arr={5,23,53,11,3,43}
    //Solve the problem without creating new Array
    

    public static void main(String[] args) {
        int[] arr= { 2,5,53,6,21,32,12,90,87};

        int d = 3;

        int i=0;
        int j=d-1;
        int temp;

        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i= d;
        j=arr.length-1;


        while(i<j){
             temp = arr[i];
             arr[i]= arr[j];
             arr[j]= temp;
             i++;
             j--;
            
        }

            
         i = 0;
        j= arr.length-1;
        while(i<j){
         temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        }

        for(int a:arr){
            System.out.print(a + " ");
        }

       
    }
}
