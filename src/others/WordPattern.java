package others;

import java.util.HashSet;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/2 下午10:05
 */
public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] strings=new String[127];
        HashSet<String> set=new HashSet<>();
        char[] pp=pattern.toCharArray();
        String[] ss=s.split(" ");
        if(pp.length!=ss.length){
            return false;
        }
        for(int i=0;i<pp.length;i++){
            char c=pp[i];
            if (strings[c]!=null) {
                if(!strings[c].equals(ss[i])){
                    return false;
                }
            }
            else{
                strings[c]=ss[i];
                if(set.contains(ss[i])){
                    return false;
                }
                set.add(ss[i]);
            }
        }
        return true;
    }
}
