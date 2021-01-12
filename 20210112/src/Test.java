import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-12
 * Time: 23:22
 **/
public class Test {
    public static void main(String[] args) {

    }

    public boolean isPopOrder(int [] pushA,int [] popA) {
        if(pushA==null || popA==null)
            return false;
        Stack<Integer> stack = new Stack<Integer>();
        //必须提前判断长度是否相等
        if(popA.length!=pushA.length || pushA.length==0)
            return false;
        int popIndex=0;
        for(int pushIndex=0; pushIndex<pushA.length; pushIndex++) {
            stack.push(pushA[pushIndex]);
            while(!stack.empty() &&stack.peek()==popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int num : pushed) {
            stack.push(num); // num 入栈
            while(!stack.isEmpty() && stack.peek() == popped[i]) { // 循环判断与出栈
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
