package recursion;

public class CountAndSay {

    static String count(int n){

        if(n == 1){
            return "1";
        }
        String s = count(n-1) + "#";
        StringBuilder ans = new StringBuilder();

        int i=0;
        int j=0;

        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }

            else{
                int freq = j-i;

                ans.append(freq);
                ans.append(s.charAt(i));

                i=j;
            }

           
        }
        return ans.toString();

    }
    public static void main(String[] args) {

        String val = count(8);
        System.out.println(val);
        
    }
}
