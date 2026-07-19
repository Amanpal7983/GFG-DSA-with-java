package twodimarray;

public class Spiral {
    public static void main(String[] args) {
        int[][] arr= {{1,2,4,56},{6,12,87,67},{8,9,7,66},{5,7,12,89}};

        int m= arr.length;

        int n= arr[0].length;

        int minr  = 0;
        int maxr  = m-1;
        int minc  = 0;
        int maxc  = n-1;

        while(minr<=maxr && minc<=maxc){

            //left to right

            for(int j=minc; j<=maxc;j++){

                System.out.print(arr[minr][j] + " ");
            }
            System.out.println();

            minr++;

            //top to bottom

            if(minr>maxr || minc > maxc){
                break;
            }

             for(int j=minr; j<=maxr;j++){

                System.out.print(arr[j][maxc] + " ");
            }
            System.out.println();
            maxc--;

            //right to left
             if(minr>maxr || minc > maxc){
                break;
            }

             for(int j=maxc; j>=minc;j--){

                System.out.print(arr[maxr][j] + " ");
            }

            System.out.println();
            maxr--;

            // bottom to top
             if(minr>maxr || minc > maxc){
                break;
            }

             for(int j=maxr; j>=minr;j--){

                System.out.print(arr[j][minc] + " ");
            }
            System.out.println();
            minc++;
       }

       
         for(int[] ele: arr){
            for(int x:ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }

  

    }
}
