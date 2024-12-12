package hot100;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/23 14:32
 */
public class LengthOfLongestSubstring08 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1){
            return s.length();
        }
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> set=new HashMap<>();
        int t=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(!set.containsKey(arr[i])){
                set.put(arr[i],i);
            }else{
                max=Math.max(max,set.size());
                int c=set.get(arr[i]);
                for(int j=t;j<=c;j++){
                    set.remove(arr[j]);
                }
                set.put(arr[i],i);
                t=c+1;
            }
            if(i==s.length()-1){
                max=Math.max(max,set.size());
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s="dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
