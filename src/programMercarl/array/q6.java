package programMercarl.array;

import java.util.Scanner;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/12 上午9:35
 */
public class q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        int[] sum=new int[n];
        int preSum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            preSum+=arr[i];
            sum[i]=preSum;
        }
        while(sc.hasNextInt()){
            int left=sc.nextInt();
            int right= sc.nextInt();
            int res;
            if(left==0){
                res=sum[right];
            }else {
                res=sum[right]-sum[left-1];
            }
            System.out.println(res);
        }
    }
}
