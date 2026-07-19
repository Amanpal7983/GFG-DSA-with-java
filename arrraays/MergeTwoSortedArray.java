package arrraays;

public class MergeTwoSortedArray {

    static void merge(int[] a, int[] b,int[] c){

        

        int i = 0;
        int j=0;
        int k = 0;
        while(i<a.length && j<b.length){
            if(a[i]>=b[j]){
                c[k] = b[j];
                j++;
                k++;
            }
            else{
                c[k]=a[i];
                i++;
                k++;

            }
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }


    }
    public static void main(String[] args) {
        int[] a = {1,3,5,7,11};
        int[] b= {2,4,5,6,9,12,23,45,65};

        int[] c= new int[a.length+ b.length];
        
         for(int ele:c){
            System.out.print(ele+" ");
        }
        
        System.out.println();
        

        merge(a, b,c);

        for(int ele:c){
            System.out.print(ele+" ");
        }
        

    }
}
