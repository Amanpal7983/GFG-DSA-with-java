public class TraverseAnArray {

    static void print(int i, int[] arr){

        if(i==arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        print( i+1 , arr);

    }
    public static void main(String[] args) {
        int[] arr= {3,63,42,63,32,12,0};

        print(0,arr);
    }
}
