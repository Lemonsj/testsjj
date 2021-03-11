import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-09
 * Time: 18:40
 **/
public class MinStack {
    public MinStack() {

    }

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStak = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if(minStak.empty()) {
            minStak.push(x);
        }else {
            if(x <= minStak.peek()) {
                minStak.push(x);
            }
        }
    }

    public int pop() {
        if(stack.empty()) {
            return -1;
        }
        int tmp = stack.pop();
        if(tmp == minStak.peek()) {
            minStak.pop();
        }
        return tmp;
    }

    public int top() {
        if(stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if(minStak.empty()) {
            return -1;
        }
        return minStak.peek();
    }
}
