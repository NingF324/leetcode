package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/5/7 下午4:13
 */
public class Merge15 {
    public static int[][] merge(int[][] intervals) {
        if(intervals.length==1){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> lists=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>intervals[i-1][1]){
                lists.add(intervals[i-1]);
            }else{
                intervals[i][0]=intervals[i-1][0];
                if(intervals[i][1]<intervals[i-1][1]){
                    intervals[i][1]=intervals[i-1][1];
                }
            }
            if(i== intervals.length-1){
                lists.add(intervals[i]);
            }
        }
        int[][] res=new int[lists.size()][2];
        for(int i=0;i<res.length;i++){
            res[i]=lists.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] ints={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(ints)));
    }
}
