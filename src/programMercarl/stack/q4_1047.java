package programMercarl.stack;

import java.util.Stack;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/21 下午4:36
 */
public class q4_1047 {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(stack.isEmpty()){
                stack.add(chars[i]);
            }else{
                if(stack.peek()==chars[i]){
                    stack.pop();
                }else{
                    stack.push(chars[i]);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        return new String(sb);
    }
}
