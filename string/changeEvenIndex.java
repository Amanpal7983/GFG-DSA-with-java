package string;


import java.util.Scanner;

public class changeEvenIndex {

    // change all even index char to the 'a'
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String s= "Aman pal";
        String t= "";

        for(int i=0;i<s.length();i++){
            if(i%2==0){
                t += 'a';
            }
            else{
                t += s.charAt(i);
            }
        }

        s = t;
        System.out.println(s);
        
    }
}
