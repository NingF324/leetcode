package programMercarl.greedy;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/12/12 上午11:13
 */
public class q6_45 {
    public int jump(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int curDistance = nums[0];
        int nextDistance = 0;
        int result =1;
        for (int i = 0; i < nums.length - 1; i++) {
            nextDistance = Math.max(nextDistance,nums[i]+i);
            if(i==curDistance){
                curDistance=nextDistance;
                result++;
            }
        }
        return result;
    }
}
