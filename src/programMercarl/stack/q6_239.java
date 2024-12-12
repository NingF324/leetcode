package programMercarl.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/21 下午5:22
 */
public class q6_239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        MyQueue myQueue=new MyQueue();
        int[] res = new int[nums.length-k+1];
        for(int i=0;i<k;i++){
            myQueue.push(nums[i]);
        }
        res[0]=myQueue.front();
        for (int i = k; i < nums.length; i++) {
            myQueue.pop(nums[i-k]);
            myQueue.push(nums[i]);
            res[i-k+1]= myQueue.front();
        }
        return res;
    }

    class MyQueue {
        Deque<Integer> deque=new LinkedList<>();
        void pop(int val){
            if (!deque.isEmpty() && val == deque.peek()) {
                deque.poll();
            }
        }

        void push(int val){
            while(!deque.isEmpty() && deque.getLast()<=val){
                deque.removeLast();
            }
            deque.add(val);
        }

        int front(){
            return deque.peek();
        }
    }
}
