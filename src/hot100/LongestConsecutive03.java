package hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/21 22:05
 */
public class LongestConsecutive03 {
    public static int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();
        int max=0;
        for (int num : nums) {
            if(!map.containsKey(num)){
                int count = 1;
                if (map.containsKey(num - 1)) {
                    count += map.get(num - 1);
                }
                map.put(num, count);
                if(map.containsKey(num +1)){
                    count+=map.get(num +1);
                    map.replace(num+map.get(num +1), count);
                    map.replace(num,count);
                }
                if(map.containsKey(num - 1)){
                    map.replace(num-map.get(num -1),count);
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={1,2,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
