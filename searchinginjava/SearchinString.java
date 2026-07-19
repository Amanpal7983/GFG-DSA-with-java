package searchinginjava;

public class SearchinString {

    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i =0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String s="Aman";

        char target ='m';
        System.out.println(search(s,target));

    }
}
