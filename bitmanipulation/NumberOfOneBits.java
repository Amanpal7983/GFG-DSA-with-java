package bitmanipulation;

public class NumberOfOneBits {
    public static void main(String[] args) {
        int n = 234;

        int count =0;

        for(int i=0;i<31;i++){
            if((n>>i)%2 !=0){
                count++;
            }
        }

        System.out.println(count);
    }

}
