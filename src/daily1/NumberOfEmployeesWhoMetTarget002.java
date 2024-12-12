package daily1;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/30 10:22
 */
public class NumberOfEmployeesWhoMetTarget002 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int hour:hours){
            if(hour>=target){
                count++;
            }
        }
        return count;
    }
}
