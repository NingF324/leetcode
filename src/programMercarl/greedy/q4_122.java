package programMercarl.greedy;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/12/12 上午10:52
 */
public class q4_122 {
    public int maxProfit(int[] prices) {
        int result =0;
        for (int i = 0; i < prices.length - 1; i++) {
            result+=Math.max(0,prices[i+1]-prices[i]);
        }
        return result;
    }
}
