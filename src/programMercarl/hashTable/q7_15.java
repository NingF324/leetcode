package programMercarl.hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/15 上午10:17
 */
public class q7_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        int left,right;
        for(int i=0;i< nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            left=i+1;
            right= nums.length-1;
            while (left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    List<Integer> list1=new ArrayList<>();
                    list1.add(nums[i]);
                    list1.add(nums[left]);
                    list1.add(nums[right]);
                    list.add(list1);
                    left++;
                    right--;
                    while (left<right&&nums[left]==nums[left-1]){
                        left++;
                    }
                    while (left<right&&nums[right]==nums[right+1]){
                        right--;
                    }
                } else if (nums[i]+nums[left]+nums[right]<0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return list;
    }
}
