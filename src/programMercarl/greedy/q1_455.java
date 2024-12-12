package programMercarl.greedy;

import java.util.Arrays;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/28 上午11:04
 */
public class q1_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index = s.length-1;
        int count =0;
        for(int i=g.length-1;i>=0;i--){
            if(index>=0&&g[i]<=s[index]){
                count++;
                index--;
            }
        }
        return count;
    }
}
