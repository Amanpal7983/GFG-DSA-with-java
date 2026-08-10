package commonproblems;

public class DigitSum {

  static int sum(int n){
    if(n==0){
      return 0;
    }

    int ans =n%9==0?9:n%9;

    return ans;
  }
  public static void main(String[] args) {
    int n =54523;
    System.out.println(sum(n));
  }
  
}
