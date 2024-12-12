package hot100;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/23 13:25
 */
public class Trap07 {
    public static int trap(int[] height) {
        int sum=0;
        int left=0;
        int right=height.length-1;
        int minHeight=0;
        while(left<right){
            if(height[left]<=minHeight){
                sum+=(minHeight-height[left]);
                left++;
                continue;
            }
            if(height[right]<=minHeight){
                sum+=(minHeight-height[right]);
                right--;
                continue;
            }
            minHeight=Math.min(height[left],height[right]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
}
