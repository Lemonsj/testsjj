import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-02
 * Time: 19:44
 **/
public class Test {

    public static void main(String[] args) {
        String s = "}";
        Boolean ret = isValid(s);
        System.out.println(ret);
    }

    public static  boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.add(s.charAt(i));
            }else {
                if(stack.size() == 0) {
                    return false;
                }else if(stack.peek() == '(' && s.charAt(i) == ')' ||
                        stack.peek() == '[' && s.charAt(i) == ']' ||
                        stack.peek() == '{' && s.charAt(i) == '}'){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        if(stack.size() > 0) {
            return false;
        }
        return true;
    }

    //最小栈

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.add(x);
        if(minStack.empty()) {
            minStack.add(x);
        }else {
            if(x <= minStack.peek()) {
                minStack.add(x);
            }
        }
    }

    public void pop() {
        if(!stack.empty()) {
            int data = stack.pop();
            if(data == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        if(stack.empty()){
            return -1;
        }
        int data = stack.peek();
        return data;
    }

    public int getMin() {
        return minStack.peek();
    }
}
