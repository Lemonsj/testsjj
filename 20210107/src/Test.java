import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-07
 * Time: 23:44
 **/
public class Test {
    public static void main(String[] args) {

    }
    Stack<Integer> data = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    Integer temp = null;
    public void push(int node) {
        if(temp == null){
            temp = node;
            data.push(node);
            min.push(node);
        }else{
            if(node <= temp){
                temp = node;
                min.push(node);
            }
            data.push(node);
        }
    }

    public void pop() {
        int top = data.pop();
        int mintop = min.peek();
        if(top == mintop){
            min.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}
