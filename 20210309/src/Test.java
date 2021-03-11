import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-09
 * Time: 0:31
 **/
public class Test {

    public static void main(String[] args) {

    }

    public static  boolean isValid(String s) {
        if(s.length() == 0 || s == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }else{
                if(stack.size() == 0) {
                    return false;
                }else if((stack.peek() == '(' && s.charAt(i) == ')')
                        || (stack.peek() == '{' && s.charAt(i) == '}')
                        || (stack.peek() == '[' && s.charAt(i) == ']')) {
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

}
