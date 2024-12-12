package programMercarl.greedy;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/12/12 上午10:46
 */
public class q3_53 {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int count =0;
        for(int i =0;i< nums.length;i++){
            count+=nums[i];
            if(count>result){
                result=count;
            }
            if(count<=0){
                count=0;
            }
        }
        return result;
    }
}
