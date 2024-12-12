package programMercarl.backTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/26 上午10:14
 */
public class q9_90 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    boolean[] used;
    public void backtracking(int[] nums,int start){
        res.add(new ArrayList<>(path));
        for(int i =start;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]&& !used[i - 1]){
                continue;
            }
            path.add(nums[i]);
            used[i]=true;
            backtracking(nums,i+1);
            used[i]=false;
            path.removeLast();
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backtracking(nums,0);
        return res;
    }
}
