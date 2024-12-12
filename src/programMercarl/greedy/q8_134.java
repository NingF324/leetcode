package programMercarl.greedy;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/12/12 下午2:36
 */
public class q8_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int totalSum = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            curSum+=gas[i]-cost[i];
            totalSum+=gas[i]-cost[i];
            if(curSum<0){
                start=i+1;
                curSum=0;
            }
        }
        if(totalSum>=0){
            return start;
        }
        return -1;
    }
}
