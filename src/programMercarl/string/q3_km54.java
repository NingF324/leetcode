package programMercarl.string;

import java.util.Scanner;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/17 下午2:43
 */
public class q3_km54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        char[] res=new char[ch.length+count*5];
        int res_index=res.length-1;
        int index=ch.length-1;
        while(res_index>=0&&index>=0){
            if(ch[index]>='0'&&ch[index]<='9'){
                res[res_index--]='r';
                res[res_index--]='e';
                res[res_index--]='b';
                res[res_index--]='m';
                res[res_index--]='u';
                res[res_index--]='n';
                index--;
            }else {
                res[res_index]=ch[index];
                res_index--;
                index--;
            }
        }
        System.out.println(new String(res));
    }
}
