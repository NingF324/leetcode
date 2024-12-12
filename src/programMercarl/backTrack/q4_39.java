package programMercarl.backTrack;

import java.util.*;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/18 上午9:29
 */
public class q4_39 {
    List<List<Integer>> res =new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    void backtracking(int[] candidates, int target,int sum ,int startIndex){
        if(sum>target){
            return;
        }
        if (sum == target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<candidates.length;i++){
            sum+=candidates[i];
            path.add(candidates[i]);
            backtracking(candidates,target,sum,i);
            sum-=candidates[i];
            path.removeLast();
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates,target,0,0);
        return res;
    }
}
