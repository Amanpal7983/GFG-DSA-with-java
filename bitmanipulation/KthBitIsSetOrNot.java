package bitmanipulation;

public class KthBitIsSetOrNot {
    public static void main(String[] args) {
        
        int n = 23456;
        int k = 4;

        n = n>>k;

        if(n%2==0){
            System.out.println("number bit is not set");
        }
        else{
            System.out.println("number bit is not set");
        }
    }
}
