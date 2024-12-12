package others;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/12 下午7:00
 */
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        left[0]=1;
        int[] right=new int[nums.length];
        right[nums.length-1]=1;
        int[] res=new int[nums.length];
        for(int i=1;i< nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i> -1;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i< nums.length;i++){
            res[i]=left[i]*right[i];
        }
        return res;
    }
}
