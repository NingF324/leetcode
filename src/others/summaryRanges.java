package others;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/13 下午8:41
 */
public class summaryRanges {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        var ans = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            int cur = nums[i];
            var sb = new StringBuilder();
            sb.append(cur);
            while (i < n - 1 && nums[i + 1] == nums[i] + 1)
                i++;
            if (nums[i] != cur) {
                sb.append("->");
                sb.append(nums[i]);
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}
