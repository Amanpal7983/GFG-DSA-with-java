package mergesort;

public class InversionCount {
    static int val;
    static int count(int[] arr){
        val=0;
        merge(arr);
        return val;

    }
    static void merge(int[] arr){
         int n = arr.length;
        if(n==1){
            return;
        }

        int[] a = new int[n/2];
        int[] b = new int[ n - n/2];
        int idx = 0;

        for(int i=0;i<a.length;i++){
            a[i] = arr[idx++];
        }

        for(int i=0;i<b.length;i++){
            b[i] = arr[idx++];
        }

        merge(a);
        merge(b);

        combine(a,b,arr);
    }

    
    static void combine(int[] a, int[] b, int[] c){
        int i=0;int j=0; int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k++] = a[i++];
            }
            else{
                val += a.length - i;  //Most important line of this code
                
                c[k++] = b[j++];
            }
        }

        while(i<a.length){
            c[k++] = a[i++];
        }
        while(j<b.length){
            c[k++] = b[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
         int no=count(arr);
         System.out.println(no);
    }
}
