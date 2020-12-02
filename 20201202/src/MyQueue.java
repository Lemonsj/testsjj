import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-02
 * Time: 17:00
 **/
public class MyQueue {
    //队列：先进的先出
    //栈：先进的后出
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int data) {
        stack1.add(data);
    }

    public int pop() {
        if(!stack2.empty()) {
            int data = stack2.pop();
            return data;
        }else{
            while(!stack1.empty()) {
                int data = stack1.pop();
                stack2.add(data);
            }
            return stack2.pop();
        }
    }

    public Boolean empty() {
        return stack1.empty() && stack2.empty();
    }

    public int peek () {
        if(!stack2.empty()) {
            int data = stack2.peek();
            return data;
        }else{
            while(stack1.size() > 0) {
                int data = stack1.pop();
                stack2.add(data);
            }
            return stack2.peek();
        }
    }
}


