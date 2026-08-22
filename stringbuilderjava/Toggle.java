package stringbuilderjava;

// toggle the stirng builder means convert lower to upper and uppar to lower case charcter


public class Toggle {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Aman");

        
        
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;

            if(ascii<91 && ascii>64){
                ascii += 32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            }
            else{
                sb.setCharAt(i, (char)(ch-32));
            }
        }
        System.out.println(sb);
    }
}
