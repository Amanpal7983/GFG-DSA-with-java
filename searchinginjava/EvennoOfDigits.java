package searchinginjava;

public class EvennoOfDigits {

    static int isEven(int[] arr){
        int count =0;
        

        for(int ele:arr){
            if(even(ele)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){

        int noOfDigits = digits(num);
        if(noOfDigits %2==0){
            return true;
        }
        return false;
    }

    static int digits(int n){
        int count=0;

        while(n>0){
            count++;

            n/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={3,5,23,754,666,5555,12};

        int ans = isEven(arr);
        System.out.println(ans);
    }
    
}
