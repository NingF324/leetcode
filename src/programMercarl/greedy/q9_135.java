package programMercarl.greedy;

import java.util.Arrays;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/12/12 下午3:07
 */
public class q9_135 {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        Arrays.fill(candy,1);
        for (int i = 0; i < ratings.length-1; i++) {
            if(ratings[i+1]>ratings[i]){
                candy[i+1]=candy[i]+1;
            }
        }
        for(int i = candy.length-1;i>0;i--){
            if(ratings[i]<ratings[i-1]){
                candy[i-1]=Math.max(candy[i-1],candy[i]+1);
            }
        }
        return Arrays.stream(candy).sum();
    }
}
