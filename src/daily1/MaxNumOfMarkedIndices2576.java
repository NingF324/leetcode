package daily1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/12 上午10:50
 */
public class MaxNumOfMarkedIndices2576 {
    public static int maxNumOfMarkedIndices(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums); // 排序
        System.out.println(Arrays.toString(nums));
        int count = 0;
        Set<Integer> markedIndices = new HashSet<>(); // 用 HashSet 来存储已标记的索引

        for (int i = nums.length - 2, j = nums.length - 1; i >= 0 && j >= i; ) {
            if (markedIndices.contains(i)) {
                i--;
                continue;
            }
            if (markedIndices.contains(j)) {
                j--;
                continue;
            }
            if (nums[j] >= 2 * nums[i]) {
                markedIndices.add(i);
                markedIndices.add(j);
                count += 2;
                j--;
            }
            i--;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{42,83,48,10,24,55,9,100,10,17,17,99,51,32,16,98,99,31,28,68,71,14,64,29,15,40};
        System.out.println(maxNumOfMarkedIndices(arr));
    }
}
