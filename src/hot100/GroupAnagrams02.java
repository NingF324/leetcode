package hot100;

import java.util.*;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/4/21 21:26
 */
public class GroupAnagrams02 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,Integer> map =new HashMap<>();
        List<List<String>> list=new ArrayList<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if (map.containsKey(s)) {
                list.get(map.get(s)).add(str);
            } else {
                map.put(s, map.size());
                list.add(new ArrayList<>());
                list.get(map.get(s)).add(str);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
