package hot100;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/29 16:31
 */
public class SingleNumber13 {
    public int singleNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                set.remove(num);
            }
        }
        return (int) set.toArray()[0];
    }
}
