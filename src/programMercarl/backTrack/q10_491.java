package programMercarl.backTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/26 上午10:30
 */
public class q10_491 {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> path =new ArrayList<>();
    public void backtracking(int[] nums,int start){
        if(path.size()>1){
            res.add(new ArrayList<>(path));
        }
        int[] used = new int[201];
        for(int i=start;i< nums.length;i++){
            if((!path.isEmpty()&&nums[i]<path.getLast())||(used[nums[i]+100]==1)){
                continue;
            }
            used[nums[i]+100]=1;
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.removeLast();
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums,0);
        return res;
    }

    public static void main(String[] args) {
        q10_491 q=new q10_491();
        int[] arr ={4,6,7,7};
        q.findSubsequences(arr);
    }
}
