package bitmanipulation;

public class ToggleTheKthbit {
    public static void main(String[] args) {
        int n = 123;

        int k =3;

        n = n ^ (1<<k);
        System.out.println(n);
    }
}
