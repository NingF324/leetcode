package programMercarl.hashTable;

import java.util.HashSet;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/15 上午8:35
 */
public class q3_202 {
    public boolean isHappy(int n) {
        int num=n;
        HashSet<Integer> record = new HashSet<>();
        while(num!=1){
            if(record.contains(num)){
                return false;
            }
            record.add(num);
            num = getNextNum(num);
        }
        return true;
    }

    public int getNextNum(int n) {
        int res=0;
        while(n!=0){
            int tmp = n%10;
            res+=tmp*tmp;
            n/=10;
        }
        return res;
    }
}
