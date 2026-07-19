package twodimarray;

//transopse means elements columns wise print honge
// upar se niche ki taraf na ki left se right ki taraf

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr= {{1,4,5},{3,6,12},{6,65,11}};

        int n = arr.length;
        int m= arr[0].length;

        // bahar wale loop ko coulumn ke liye chalao
        // aur andar wali loop ko row ke liye chalao    opposite loop

        for(int j = 0;j<m;j++){
            for(int i=0;i<n;i++){

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // if order in starting is nxm than new order is mxn

        int[][] array = new int[m][n];

         for(int i= 0;i<m;i++){
            for(int j=0;j<n;j++){

                array[i][j] = arr[j][i];

               
            }
           
        }
        for(int[] ele: array){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }


    }
}
