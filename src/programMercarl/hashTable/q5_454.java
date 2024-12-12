package programMercarl.hashTable;

import java.util.HashMap;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/15 上午9:10
 */
public class q5_454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num1:nums1){
            for(int num2:nums2){
                if(map.containsKey(num1+num2)){
                    map.put(num1+num2,map.get(num1+num2)+1);
                }else {
                    map.put(num1+num2,1);
                }
            }
        }
        int count=0;
        for(int num3:nums3){
            for (int num4:nums4){
                if(map.containsKey(-num3-num4)){
                    count+=map.get(-num3-num4);
                }
            }
        }
        return count;
    }
}
