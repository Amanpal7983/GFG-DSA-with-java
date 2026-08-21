package bitmanipulation;

public class SetTheRightmostUnsetBit {
    public static void main(String[] args) {
        int n = 39;

        // pahle number me 1 add karo 
        int a = n+1;

        //ab dono ka OR karo
       int ans = a | n;
        System.out.println(ans);

    }
}
