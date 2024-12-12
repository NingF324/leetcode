package others;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/24 上午8:04
 */
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;

    public MinStack() {
        stack=new Stack<>();
        min=new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(min.empty()){
            min.push(val);
        }else {
            min.push(Math.min(min.peek(),val));
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
