package hot100;

import java.util.HashMap;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/25 15:30
 */
public class SubarraySum10 {
    /*public static int subarraySum(int[] nums, int k) {
        int len= nums.length;
        int[] dpt=new int[len+5];
        dpt[0]=nums[0];
        int count=0;
        if(dpt[0]==k){
            count++;
        }
        for(int i=1;i<len;i++){
            dpt[i]=dpt[i-1]+nums[i];
            if(dpt[i]==k){
                count++;
            }
        }
        for(int i=1;i<len;i++){
            for(int j=i;j<len;j++){
                if ((dpt[j]-dpt[i]+nums[i])==k) {
                    count++;
                }
            }
        }
        return count;
    }*/

    public static int subarraySum(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();       //时间复杂度优秀
		int n = nums.length;
		int res = 0, pres = 0;
		map.put(0, 1);
		for (int i = 0; i < n; i ++) {
			pres += nums[i];
			if (map.containsKey(pres - k)) res += map.get(pres - k);
			map.put(pres, map.getOrDefault(pres, 0) + 1);
		}
		return res;
	}

    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        System.out.println(subarraySum(arr,3));
    }
}
