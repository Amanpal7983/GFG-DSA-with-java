import java.util.ArrayList;

public class SubsetsOfaSTring {

    static ArrayList<String> arr = new ArrayList<>();
    static void subset(int i, String str, String ans) {

        if (i == str.length()) {
           arr.add(ans);
            return;
        }

        char ch = str.charAt(i);
        subset(i + 1, str, ans);
        subset(i + 1, str, ans + ch);

    }

    public static void main(String[] args) {

        String str = "aman";

        subset(0, str, "");
        System.out.println(arr);
    }
}
