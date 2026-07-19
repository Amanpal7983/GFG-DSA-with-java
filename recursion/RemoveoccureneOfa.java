public class RemoveoccureneOfa {
    static void print(int i, String str ,String ans){

        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        if(str.charAt(i) != 'a'){
            ans  = ans + str.charAt(i);
        }
        
        print( i+1 , str, ans);

    }
    public static void main(String[] args) {
        

        String str = "Aman pal";

        print(0, str , "");
    }
}
