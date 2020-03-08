import java.util.Stack;

public class test {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        /*if(!stack1.empty()) {
            stack1.push(node);
        }
        if(!stack2.empty()) {
            stack2.push(node);
        }
        if(stack1.empty() && stack2.empty()) {
            stack1.push(node);
        }*/

        stack1.push(node);
    }

    public int pop() {
        if(stack2.size() <= 0) {
            while(stack1.size() > 0) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
