package arrraays;
public class Marks {
    
    public static void main(String[] args) {
        
        int[] arr= { 3,43,87,67,34,65,78,32};

        int n =arr.length;
        int sum =0;

        for (int i = 0; i <n ; i++) {
            sum+= arr[i];
           
        }
        System.out.print(sum);

        
    }
}
