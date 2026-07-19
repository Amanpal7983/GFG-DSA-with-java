package sortjava.stringbuilderjava;
import java.util.Arrays;
// means if one string is abc and anotehr sting is cba thean both are anagram
// dono me same words ya char contain ho

public class ValidAnagram {

    static boolean anagram(String a, String b){

        if(a.length()!=b.length()){
            return false;
        }

        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);


        for(int i=0;i<c.length;i++){
            if(c[i]!=d[i]){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {

        String s = "Aman";

        String b = "mnAa";

        System.out.println(anagram(s, b));

       
    }
}
