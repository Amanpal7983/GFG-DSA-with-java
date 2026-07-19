package arrraays;
import java.util.Collections;
import java.util.Vector;

public class ArrayPlusone {
    // in this problem we treat whole array as a integer and add one to the last digit(also said add one to the whole number)
    // return a vector

    static Vector<Integer> addOne(int[] arr){
        Vector<Integer> ans = new Vector<>();

        int n = arr.length;
        int carry = 1;

        for(int i=n-1;i>=0;i--){
            if(arr[i]+carry <=9){
                ans.add(arr[i]+ carry);
                carry = 0;

            }

            else{
                ans.add(0);
                carry=1;
            }
        }

        if(carry==1){
            ans.add(1);
        }
        Collections.reverse(ans);
        
        return ans;
        
    }

    public static void main(String[] args) {
        int[] arr = { 9,9,9};
        System.out.println(addOne(arr));
    }
    
}

// if we want to return a int 


// class Solution {
//     public int[] plusOne(int[] digits) {

//         for(int i = digits.length-1;i>=0;i--){
//             if(digits[i]<9){
//                 digits[i]++;
//                 return digits;
//             }

//             digits[i]=0;
//         }

//         int[] ans = new int[digits.length+1];
//         ans[0] = 1;

//         return ans;
        
//     }
// }