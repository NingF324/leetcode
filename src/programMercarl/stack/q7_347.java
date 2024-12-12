package programMercarl.stack;

import java.util.*;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/29 下午7:12
 */
public class q7_347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }
        PriorityQueue<int[]> queue=new PriorityQueue<>((pair1, pair2) -> pair2[1] - pair1[1]);
        map.forEach((key,value)->{
            queue.add(new int[]{key,value});
        });
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]= Objects.requireNonNull(queue.poll())[0];
        }
        return res;
    }
}
