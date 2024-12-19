package programMercarl.greedy;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/12/12 下午3:22
 */
public class q10_860 {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,twenty=0;
        for (int bill:bills){
            if(bill==5){
                five++;
            }
            if(bill==10){
                five--;
                ten++;
                if(five<0){
                    return false;
                }
            }
            if(bill==20){
                if(ten>0){
                    ten--;
                    five--;
                    twenty++;
                    if(five<0){
                        return false;
                    }
                }else {
                    five-=3;
                    twenty++;
                    if(five<0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
