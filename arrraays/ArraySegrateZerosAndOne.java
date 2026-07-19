package arrraays;

public class ArraySegrateZerosAndOne {
    // isme saare zero ek side or saare ones ek side me aayenge 
    // zero left side and one right side


    static void func(int[] arr){
        int zeros=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;
            }
           
        
        }
        for(int j = 0;j<zeros;j++){
            arr[j] = 0;
        }
        for(int k =zeros;k<arr.length;k++){
            arr[k] = 1;
        }

        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr= {0,1,1,0,0,1,1,0,0,0,1,1,1,0,1};
        func(arr);

    }
}
