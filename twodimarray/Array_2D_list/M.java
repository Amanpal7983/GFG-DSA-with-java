package twodimarray.Array_2D_list;

import java.util.*;

public class M {
    public static void main(String[] args) {
        ArrayList<Integer> a =  new ArrayList<>();
        a.add(34); a.add(12);
        ArrayList<Integer> b =  new ArrayList<>();
        b.add(45);
        b.add(34);
        ArrayList<Integer> c =  new ArrayList<>();
        c.add(8); c.add(1); c.add(67);
        ArrayList<Integer> d =  new ArrayList<>();
        d.add(3);

        List<List<Integer>> list = new ArrayList<>(4);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        // printing of 2d ARrray list

        for(int i = 0;i<list.size();i++){
            List<Integer> x = list.get(i);
            for(int j= 0;j<x.size();j++){
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }

        //Method 2 
        for(int i = 0;i<list.size();i++){
            for(int j = 0;j<list.get(i).size();j++){
                System.out.print( list .get(i).get(j) + " ");
            }
            System.out.println();
        }
        


    }
}
