package programMercarl.stack;

import java.util.Stack;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/21 下午4:32
 */
public class q3_20 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(t=='('){
                stack.add(t);
            }else if (t=='['){
                stack.add(t);
            }else if (t=='{'){
                stack.add(t);
            } else if (t==')') {
                if(stack.empty()||stack.pop()!='('){
                    return false;
                }
            } else if (t==']') {
                if(stack.empty()||stack.pop()!='['){
                    return false;
                }
            } else if (t=='}') {
                if(stack.empty()||stack.pop()!='{'){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
