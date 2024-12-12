package programMercarl.hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/15 上午10:53
 */
public class q8_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i< nums.length;i++){
            if(nums[i]>target&&(nums[i]>=0 || target>=0)){
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int k=i+1;k< nums.length;k++){
                if(nums[k]+nums[i]>target&&nums[i]+nums[k]>=0){
                    break;
                }
                if(k>i+1&&nums[k]==nums[k-1]){
                    continue;
                }
                int left=k+1,right= nums.length-1;
                while(left<right){
                    int sum=nums[i]+nums[k]+nums[left]+nums[right];
                    if(sum<target){
                        left++;
                    }
                    else if (sum>target){
                        right--;
                    }else {
                        list.add(Arrays.asList(nums[i],nums[k],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left<right&&nums[left]==nums[left-1]){
                            left++;
                        }
                        while (left<right&&nums[right]==nums[right+1]){
                            right--;
                        }
                    }
                }
            }
        }
        return list;
    }
}
