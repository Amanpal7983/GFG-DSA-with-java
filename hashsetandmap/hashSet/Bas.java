package hashsetandmap.hashSet;
import java.util.HashSet;

public class Bas {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(334);
        set.add(33);
        set.add(25);
        set.add(205);
        System.out.println(set);
        set.remove(33);
        System.out.println(set);
        System.out.println(set.size());

        Object[] arr = set.toArray();
       for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
       
       }

    }
}
