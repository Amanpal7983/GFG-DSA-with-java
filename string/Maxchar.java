package string;

public class Maxchar {
    public static void main(String[] args) {
        String s = "mynamaegpppp";
       

        int[] arr = new int[26];

        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = (int)ch -97;

            arr[idx]++;


        }

        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] == max){
                char ch = (char)(i+97);
                System.out.print(ch+ " ");
            }
        }

    }
}
