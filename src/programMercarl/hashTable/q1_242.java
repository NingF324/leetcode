package programMercarl.hashTable;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/14 下午5:21
 */
public class q1_242 {
    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index=s.charAt(i)-'a';
            record[index]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int index=t.charAt(i)-'a';
            record[index]--;
        }
        for(int num :record){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
