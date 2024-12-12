package programMercarl.stack;

import java.util.Stack;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/21 下午4:09
 */
public class MyQueue {
    Stack<Integer> input,output;

    public MyQueue() {
        input=new Stack<>();
        output=new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if(output.empty()){
            while(!input.empty()){
                output.push(input.pop());
            }
            return output.pop();
        }else {
            return output.pop();
        }
    }

    public int peek() {
        if(output.empty()){
            while(!input.empty()){
                output.push(input.pop());
            }
            return output.peek();
        }else {
            return output.peek();
        }
    }

    public boolean empty() {
        return input.empty()&& output.empty();
    }
}
