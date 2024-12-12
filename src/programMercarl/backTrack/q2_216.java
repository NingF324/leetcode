package programMercarl.backTrack;

import java.util.*;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/11 下午8:10
 */
public class q2_216 {
    List<Integer> path=new ArrayList<>();
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(n,k,0,1);
        return result;
    }

    void backtracking(int targetSum,int k,int sum,int startIndex){
        //剪枝优化
        if(sum>targetSum){
            return;
        }
        if(path.size()==k){
            if(sum==targetSum){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for(int i=startIndex;i<=9;i++){
            sum+=i;
            path.add(i);
            backtracking(targetSum,k,sum,i+1);
            sum-=i;
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        q2_216 q =new q2_216();
        q.combinationSum3(3,7);
    }
}
