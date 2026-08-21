package bitmanipulation;

public class IsPowerOfTwo {

    static boolean power(int n){
        if(n==0){
            return false;
        }

        while(n>1){
            if(n%2==1){
                return false;
            }

            n = n/2;
        }

        return true;

    }
    public static void main(String[] args) {
        int n = 130;

        System.out.println(power(n));

       
    }
}
