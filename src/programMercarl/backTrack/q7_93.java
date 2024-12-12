package programMercarl.backTrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/26 上午8:36
 */
public class q7_93 {
    List<String> res = new ArrayList<>();
    int pointNum=0;
    public void backtracking(StringBuilder s,int start){
        if(pointNum==3){
            if(isValid(s,start,s.length()-1)){
                res.add(s.toString());
                return;
            }
        }
        for (int i = start; i < s.length(); i++) {
            if(isValid(s,start,i)){
                s.insert(i+1,'.');
                pointNum++;
                backtracking(s,i+2);
                pointNum--;
                s.deleteCharAt(i+1);
            }
        }
    }
    public boolean isValid(StringBuilder s,int start,int end){
        if(start>end){
            return false;
        }
        if(s.charAt(start)=='0'&&start!=end){
            return false;
        }
        int num=0;
        for (int i=start;i<=end;i++){
            char c = s.charAt(i);
            if(c>'9'||c<'0'){
                return false;
            }
            num=num*10+c-'0';
            if(num>255){
                return false;
            }
        }
        return true;
    }
    public List<String> restoreIpAddresses(String s) {
        StringBuilder sb =new StringBuilder(s);
        backtracking(sb,0);
        return res;
    }
}
