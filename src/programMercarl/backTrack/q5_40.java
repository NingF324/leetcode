package programMercarl.backTrack;

import java.util.*;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/20 上午11:14
 */
public class q5_40 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path =new ArrayList<>();
    public void backTracking(int[] candidates,int target,int sum,int start,boolean[] used){
        if(sum==target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start;i<candidates.length&&sum+candidates[i]<=target;i++){
            if(i>0&& candidates[i]==candidates[i-1] && !used[i-1]){
                continue;
            }
            sum+=candidates[i];
            path.add(candidates[i]);
            used[i]=true;
            backTracking(candidates,target,sum,i+1,used);
            used[i]=false;
            path.removeLast();
            sum-=candidates[i];
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] used=new boolean[candidates.length];
        Arrays.sort(candidates);
        backTracking(candidates,target,0,0,used);
        return res;
    }
}
