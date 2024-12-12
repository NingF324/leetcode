package hot100;

import java.util.Arrays;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/22 14:08
 */
public class MoveZeroes04 {
    public static void moveZeroes(int[] nums) {
        if(nums==null) {
            return;
        }
        int j = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                nums[j++] = nums[i];
            }
        }
        for(int i=j;i<nums.length;++i) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr={0,1};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
