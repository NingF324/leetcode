package programMercarl.backTrack;

import java.util.*;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/11/18 上午9:10
 */
public class q3_17 {
    final static String[] letterMap = {
                "", // 0
                "", // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs", // 7
                "tuv", // 8
                "wxyz" // 9
    };
    List<String> result =new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();
    public List<String> letterCombinations(String digits) {
        backtracking(digits,0);
        return result;
    }
    void backtracking(String digits,int index){
        if(digits.isEmpty()){
            return;
        }
        if(index == digits.length()){
            result.add(new String(stringBuilder));
            return;
        }
        int digit = digits.charAt(index) - '0';
        String letters = letterMap[digit];
        for (int i=0;i<letters.length();i++){
            stringBuilder.append(letters.charAt(i));
            backtracking(digits,index+1);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
