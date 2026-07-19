package hashsetandmap.hashSet;

import java.util.HashSet;

public class iterate {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("Aman");
        s.add("hello");
        s.add("world");
        System.out.println(s);
        s.clear();
        System.out.println(s);
    }
}
