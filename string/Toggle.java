package string;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i =0;i<sb.length();i++){
           char ch = sb.charAt(i);
           int ascii = (int)ch;
           if(ascii >=65 && ascii <=90){
            sb.setCharAt(i, (char)(ascii+32));
           }
           else{
             sb.setCharAt(i, (char)(ascii-32));
           }
        }
        System.out.println(sb);
    }
}
