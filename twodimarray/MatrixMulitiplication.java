package twodimarray;

public class MatrixMulitiplication {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{6,7,8}};
        int[][] b = {{11,21,3},{46,51,68},{61,70,86}};

        int m = a.length;
        int n = b[0].length;

        if(a[0].length != b.length){
            System.out.println("MUltiplication is not posible");
        }
        else{
            int [][] ans = new int[m][n];

            for(int i=0;i<ans.length;i++){
                for(int j=0;j<ans[0].length;j++){
                    for(int k=0;k<ans.length;k++){

                        ans[i][j] += a[i][k] * b[k][j];

                    }
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
