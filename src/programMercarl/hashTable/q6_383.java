package programMercarl.hashTable;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/15 上午9:22
 */
public class q6_383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            arr[ransomNote.charAt(i)-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            arr[magazine.charAt((i))-'a']--;
        }
        for(int tmp:arr){
            if(tmp>0){
                return false;
            }
        }
        return true;
    }
}
