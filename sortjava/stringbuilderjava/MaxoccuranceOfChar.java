package sortjava.stringbuilderjava;

// print the char which appear the max time in the given string

public class MaxoccuranceOfChar {
    public static void main(String[] args) {
        String s = new String("helloaman");

        int[] freq = new int[26];
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int n = (int)(ch-97);

            freq[n]++;
        }
        int maxfreq = -1;

        for(int i=0;i<freq.length;i++){

            maxfreq = Math.max(maxfreq,freq[i]);
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]==maxfreq){
                char ch= (char)(i+97);
                System.out.println(ch+ " ");
            }
        }
    
    }
}
