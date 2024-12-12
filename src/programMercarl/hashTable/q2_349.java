package programMercarl.hashTable;

import java.util.HashSet;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/14 下午5:27
 */
public class q2_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null ||nums1.length==0||nums2 ==null ||nums2.length==0){
            return null;
        }
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num1 : nums1){
            set1.add(num1);
        }
        for(int num2: nums2){
            if(set1.contains(num2)){
                set2.add(num2);
            }
        }
        int[] res = new int[set2.size()];
        int index=0;
        for(int tmp:set2){
            res[index++]=tmp;
        }
        return res;
    }
}
