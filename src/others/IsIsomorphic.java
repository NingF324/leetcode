package others;

import java.util.HashMap;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/2 下午9:22
 */
public class IsIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> s2t=new HashMap<>();
        HashMap<Character,Character> t2s=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            if((s2t.containsKey(sc)&& s2t.get(sc)!=tc)||(t2s.containsKey(tc)&&t2s.get(tc)!=sc)){
                return false;
            }
            s2t.put(sc,tc);
            t2s.put(tc,sc);
        }
        return true;
    }
}
