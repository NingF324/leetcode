package programMercarl.string;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/17 下午2:28
 */
public class q1_344 {
    public void reverseString(char[] s) {
        int left=0,right=s.length-1;
        while(left<right){
            char tmp =s[left];
            s[left]=s[right];
            s[right]=tmp;
            left++;
            right--;
        }
    }
}
