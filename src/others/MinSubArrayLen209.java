package others;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/18 下午3:45
 */
public class MinSubArrayLen209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int window = 0;
        int left = 0, right = 0;
        int res = Integer.MAX_VALUE;
        while(right < nums.length){
            window += nums[right];//更新窗口状态
            right++;//扩大窗口
            //窗口收缩，满足题意>= target收缩
            while(window >= target){
                res = Math.min(res, right - left);
                window -= nums[left];
                left++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
