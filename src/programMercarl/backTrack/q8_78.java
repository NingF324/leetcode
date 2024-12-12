package programMercarl.backTrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/26 上午9:18
 */
public class q8_78 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path=new ArrayList<>();
    public void backtracking(int[] nums,int start){
        res.add(new ArrayList<>(path));
        for(int i =start;i<nums.length;i++){
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.removeLast();
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums,0);
        return res;
    }
}
