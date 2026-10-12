package arrraays;

public class ContainerWithMaxWater {
    static int maxArea(int[] container){

        int left =0;
        int right = container.length-1;
        int maxWater = 0;

        while(left<right){
            int width = right - left;

             int height = Math.min(container[left],container[right]);
             int area = width * height;

              maxWater = Math.max(area, maxWater);

              if(container[left] < container[right]){
                left++;
              }
              else{
                right--;
              }
        }
        return maxWater;

    }
    public static void main(String[] args){
        int[] container = { 3,8,2,3,6,7,8,1,4,9};

        int ans = maxArea(container);
        System.out.println(ans);


    }
}
