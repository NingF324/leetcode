package others;

import java.util.HashMap;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/2 下午8:36
 */
public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<magazine.length();i++){
            char c=magazine.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else map.put(c,1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char c=ransomNote.charAt(i);
            if(!map.containsKey(c)){
                return false;
            }else {
                int count=map.get(c)-1;
                if(count<0)
                    return false;
                map.put(c,count);
            }
        }
        return true;
    }
}
