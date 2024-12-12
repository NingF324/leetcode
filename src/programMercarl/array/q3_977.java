package programMercarl.array;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/12 上午8:32
 */
public class q3_977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left=0,right= nums.length-1;
        for(int i =result.length-1;i>=0;i--){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                result[i]=nums[left]*nums[left];
                left++;
            }else {
                result[i]=nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
}
