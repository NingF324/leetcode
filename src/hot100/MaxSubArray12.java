package hot100;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/28 14:56
 */
public class MaxSubArray12 {
    public static int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        int max=nums[0];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            max=Math.max(dp[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
