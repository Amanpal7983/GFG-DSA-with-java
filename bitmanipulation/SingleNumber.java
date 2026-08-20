package bitmanipulation;

// array me kon sa element sirf ek bar hi aya hai baki sab duplicate hai

public class SingleNumber {

    public static void main(String[] args) {
        int[] arr = { 2,3,4,5,5,4,3,2,1};
        
        int xor = 0;

        for(int ele:arr){
            xor= xor^ele;
        }

        System.out.println(xor);
    }
    
}
