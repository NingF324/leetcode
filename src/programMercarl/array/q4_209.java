package programMercarl.array;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/12 上午8:38
 */
public class q4_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int result=Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int right=0;right< nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                result=Math.min(right-left+1,result);
                sum-=nums[left];
                left++;
            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }
}
