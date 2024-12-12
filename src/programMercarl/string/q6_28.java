package programMercarl.string;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/18 上午8:39
 */
public class q6_28 {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        int[] next=getNext(needle);
        int j=0;
        for(int i = 0;i<haystack.length();i++){
            while (j>0&&haystack.charAt(i)!=haystack.charAt(j)){
                j=next[j-1];
            }
            if(haystack.charAt(i)==haystack.charAt(j)){
                j++;
            }
            if(j == needle.length()){
                return i-needle.length()+1;
            }
        }
        return -1;
    }

    public int[] getNext(String s){
        int[] next =new int[s.length()];
        int j=0;
        next[0]=0;
        for(int i = 1;i<s.length();i++){
            while(j>0&&s.charAt(i)!=s.charAt(j)){
                j=next[j-1];
            }
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            next[i]=j;
        }
        return next;
    }
}
