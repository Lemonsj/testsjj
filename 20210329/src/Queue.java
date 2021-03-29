import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-29
 * Time: 22:15
 **/
public class Queue {
    public Queue() {

    }

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int x) {
        stack1.push(x);
    }
    public int pop() {
        if(stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }else if(stack2.isEmpty()) {
            while(stack1.size()-1 > 0) {
                int tmp = stack1.pop();
                stack2.push(tmp);
            }
            return stack1.pop();
        }else {
            return stack2.pop();
        }
    }

    public int peek() {
        if(stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }else if(stack2.isEmpty()) {
            while(stack1.size()-1 > 0) {

                stack2.push(stack1.pop());
            }
            stack2.push(stack1.peek());
            return stack1.pop();
        }else {
            return stack2.peek();
        }
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
