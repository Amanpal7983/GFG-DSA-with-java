package string;
import java.util.*;

public class Anagram {

    static boolean check(String a ,String b){
        if(a.length() != b.length()){
            return false;
        }
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);
        for(int i=0;i<x.length;i++){
            if(x[i] != y[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "abcde";
        String b = "bhaed";

        boolean h = check(a,b);
        System.out.println(h);


    }
}
