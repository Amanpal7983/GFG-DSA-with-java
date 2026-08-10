package recursion;

public class Hcf {

    static int hcf(int a, int b){

        

        if(a==1 || a%b==0){
            return a;
        }

       
      

      return hcf(a%b , a);
        
    }
    public static void main(String[] args) {
        int a= 41;
        int b=90;

        int ans=  hcf(a,b);
        System.out.println(ans);
    }
}
