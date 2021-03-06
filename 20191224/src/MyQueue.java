import java.util.Stack;

public class MyQueue {

    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public MyQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int x) {
        stack1.push(x);
    }
    public int pop() {
        if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        if(!stack2.empty()) {
            return stack2.pop();
        }
        return -1;
    }
    public int peek() {
        if(stack2.empty()) {
            while(!stack1.empty()) {
                stack2.push(stack1.peek());
            }
        }
        if(!stack2.empty()) {
            return stack2.peek();
        }
        return -1;
    }
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}
