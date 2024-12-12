package programMercarl.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/12/12 下午2:17
 */
public class q7_1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums)
                .boxed()
                .sorted((o1,o2) ->Math.abs(o2)-Math.abs(o1))
                .mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < nums.length; i++) {
            if(k==0){
                break;
            }
            if(nums[i]<0){
                nums[i]=-nums[i];
                k--;
            }
        }
        int res= Arrays.stream(nums).sum();
        if(k%2!=0){
            res-=nums[nums.length-1]*2;
        }
        return res;
    }
}
