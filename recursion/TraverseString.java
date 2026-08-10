package recursion;

public class TraverseString {
    

    static void print(int i, String str){

        if(i==str.length()){
            return;
        }
        System.out.print(str.charAt(i) + " ");
        print( i+1 , str);

    }
    public static void main(String[] args) {
        

        String str = "Aman pal";

        print(0, str);
    }
}
