package hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/21 20:51
 */
public class TwoSum01 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i );
        }
        return null;
    }


}
