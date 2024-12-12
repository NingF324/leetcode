package programMercarl.array;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/12 上午8:11
 */
public class q1_704 {
    public int search(int[] nums, int target) {
        int left=0,right= nums.length;
        while(left<right){
            int middle = (left+right)/2;
            if(nums[middle] == target){
                return middle;
            } else if (nums[middle]>target) {
                right=middle;
            } else if (nums[middle]<target) {
                left=middle+1;
            }
        }
        return -1;
    }
}
