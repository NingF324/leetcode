package programMercarl.greedy;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/28 上午11:11
 */
public class q2_376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int prediff=0;
        int curdiff=0;
        int result=1;
        for(int i=0;i<nums.length-1;i++){
            curdiff = nums[i+1]-nums[i];
            if((curdiff>0&&prediff<=0)||(curdiff<0&&prediff>=0)){
                result++;
                prediff = curdiff;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,5,5,1,4};
        q2_376 q = new q2_376();
        System.out.println(q.wiggleMaxLength(arr));
    }
}
