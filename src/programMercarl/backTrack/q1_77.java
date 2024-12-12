package programMercarl.backTrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/11 下午7:14
 */
public class q1_77 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public void backTracking(int start,int n,int k){
        if(path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<=n - (k - path.size()) + 1;i++){
            path.add(i);
            backTracking(i+1,n,k);
            path.removeLast();
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        backTracking(1,n,k);
        return res;
    }

    public static void main(String[] args) {
        q1_77 q=new q1_77();
        System.out.println(q.combine(5,2));
    }
}
