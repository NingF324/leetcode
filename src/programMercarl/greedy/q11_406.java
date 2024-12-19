package programMercarl.greedy;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/12/19 下午3:07
 */
public class q11_406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b) -> {
            if(a[0]==b[0]) return a[1]-b[1];
            else return b[0]-a[0];
        });
        LinkedList<int[]> list = new LinkedList<>();
        for (int[] person : people) {
            list.add(person[1],person);
        }
        return list.toArray(new int[people.length][]);
    }
}
