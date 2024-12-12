package programMercarl.string;

import java.util.Scanner;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/18 上午8:31
 */
public class q5_km55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k =scanner.nextInt();
        String s =scanner.next();
        char[] arr=s.toCharArray();
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        System.out.println(new String(arr));
    }

    public static void reverse(char[] arr, int left,int right){
        while (left<right){
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
}
