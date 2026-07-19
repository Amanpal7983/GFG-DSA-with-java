package hashsetandmap.hashSet;
import java.util.*;


public class distinct {

    static int check(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i<arr.length;i++){
            set.add(arr[i]);
            set.add(reverse(arr[i]));
        }
        return set.size();
    }

    static int reverse(int n){
        int r = 0;
        while(n!=0){
            r = r*10 + n%10;
            n/=10;
        }
        return r;
    }
    public static void main(String[] args) {
        int[] arr = {34,12,49,67,56,21,87};

        int ans = check(arr);
        System.out.println(ans);
        
    }
}
