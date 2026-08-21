package bitmanipulation;

public class SetTheKthBit {
    public static void main(String[] args) {
        int n =49;
          int k=3;
           

          n = (n | (1<<k));
          System.out.println(n);

    }
}
