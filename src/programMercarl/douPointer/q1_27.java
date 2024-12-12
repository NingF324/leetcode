package programMercarl.douPointer;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/21 上午9:04
 */
public class q1_27 {
    public int removeElement(int[] nums, int val) {
        int fast=0,slow=0;
        for(;fast< nums.length;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
