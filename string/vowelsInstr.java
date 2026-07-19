package string;

// calculate the total num of vowels in the string
public class vowelsInstr {
    static boolean isVowel(char c) {
        if (c == 'a' || c == 'A') {
            return true;
        }
        if (c == 'e' || c == 'E') {
            return true;
        }
        if (c == 'i' || c == 'I') {
            return true;
        }
        if (c == 'o' || c == 'O') {
            return true;
        }
        if (c == 'u' || c == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "Amanpal";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isVowel(c) == true) {
                count++;
            }
        }

        System.out.println(count);
    }

}
