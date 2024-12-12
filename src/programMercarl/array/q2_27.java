package programMercarl.array;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/12 上午8:25
 */
public class q2_27 {
    public int removeElement(int[] nums, int val) {
        int slow =0;
        for(int fast=0;fast< nums.length;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
