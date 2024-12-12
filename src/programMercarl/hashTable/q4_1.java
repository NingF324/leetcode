package programMercarl.hashTable;

import java.util.HashMap;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/15 上午8:44
 */
public class q4_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i );
        }
        return null;
    }
}
