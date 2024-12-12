package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/25 14:41
 */
public class FindAnagrams09 {
    public static List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()){
            return new ArrayList<>();
        }
        List<Integer> list=new ArrayList<>();
        int[] arrp=new int[128];
        int[] arrt=new int[128];
        Arrays.fill(arrp,0);
        Arrays.fill(arrt,0);
        for(int i=0;i<p.length();i++){
            arrp[p.charAt(i)]++;
        }
        int left=0;
        int right=p.length();
        for(int i=0;i<p.length();i++){
            arrt[s.charAt(i)]++;
        }
        while(left<=s.length()-p.length()){
            if(left==s.length()-p.length()){
                if(Arrays.equals(arrp, arrt)){
                    list.add(left);
                }
                left++;
            }else{
                if(Arrays.equals(arrp, arrt)){
                    list.add(left);
                }
                arrt[s.charAt(left)]--;
                arrt[s.charAt(right)]++;
                left++;
                right++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s="abab";
        String p="ab";
        System.out.println(findAnagrams(s,p));
    }
}
