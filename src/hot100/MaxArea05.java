package hot100;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/23 10:05
 */
public class MaxArea05 {
    public static int maxArea(int[] height) {
        int max=0;
        int i=0,j= height.length-1;
        while(i<j){
            if(height[i]>height[j]){
                max=Math.max((j-i)*height[j],max);
                j--;
            }else {
                max=Math.max((j-i)*height[i],max);
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
