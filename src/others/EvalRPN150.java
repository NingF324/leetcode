package others;

import java.util.Stack;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/24 上午8:18
 */
public class EvalRPN150 {
    public int evalRPN(String[] tokens) {
        Stack<String> stack=new Stack<>();
        for(String token :tokens) {
            switch (token){
                case ("+"):{
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(a+b));
                    break;
                }
                case ("-"):{
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(b-a));
                    break;
                }
                case ("*"):{
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(a*b));
                    break;
                }
                case ("/"):{
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.add(String.valueOf(b/a));
                    break;
                }
                default:{
                    stack.add(token);
                    break;
                }
            }
        }
        return Integer.parseInt(stack.peek());
    }
}
