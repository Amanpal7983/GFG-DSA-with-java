package stringbuilderjava;
// basics of string builder in java

public class Basics {
    public static void main(String[] args) {
        

        String s = "hello world";
        
        StringBuilder sb = new StringBuilder(s); //to create empty string builder

        System.out.println(sb.capacity()); // give the cap of stringb . bydefault value is 16
    }
    
}
