package hot100;

import java.net.Inet4Address;
import java.util.*;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/26 14:42
 */
public class MaxSlidingWindow11 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] arr=new int[n-k+1];
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] pair1, int[] pair2) {
                return pair1[0] != pair2[0] ? pair2[0] - pair1[0] : pair2[1] - pair1[1];
            }
        });
        for(int i=0;i<k;i++){
            pq.offer(new int[]{nums[i],i});
        }
        arr[0]=pq.peek()[0];
        for(int i=k;i< nums.length;i++){
            pq.offer(new int[]{nums[i],i});
            while(pq.peek()[1]<=i-k){
                pq.poll();
            }
            arr[i-k+1]=pq.peek()[0];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 3)));
    }
}
