package programMercarl.backTrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/26 上午8:20
 */
public class q6_131 {
    List<List<String>> res= new ArrayList<>();
    List<String> path = new ArrayList<>();
    public void backtracking(String s ,int start){
        if(start>=s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if(isValid(s,start,i)){
                String subStr = s.substring(start,i+1);
                path.add(subStr);
            }else continue;
            backtracking(s,i+1);
            path.removeLast();
        }
    }
    public boolean isValid(String s,int start,int end){
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        backtracking(s,0);
        return res;
    }
}
