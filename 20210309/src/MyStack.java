import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-09
 * Time: 17:34
 **/
public class MyStack {
    public MyStack() {
    }

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    public void push(int x) {
        if(queue1.isEmpty() && queue2.isEmpty()) {
            queue1.offer(x);
        }else if(!queue1.isEmpty()) {
            queue1.offer(x);
        }else {
            queue2.offer(x);
        }
    }
    public int pop(){
        if(queue1.isEmpty()) {
            while(queue2.size()-1 > 0) {
                int tmp = queue2.poll();
                queue1.offer(tmp);
            }
            return queue2.poll();
        }else {
            while(queue1.size()-1 > 0) {
                int tmp = queue1.poll();
                queue2.offer(tmp);
            }
            return queue1.poll();
        }
    }

    public int top() {
        if(queue1.isEmpty()) {
            while(queue2.size()-1 > 0) {
                int tmp = queue2.poll();
                queue1.offer(tmp);
            }
            queue1.offer(queue2.peek());
            return queue2.poll();
        }else {
            while(queue1.size()-1 > 0) {
                int tmp = queue1.poll();
                queue2.offer(tmp);
            }
            queue2.offer(queue1.peek());
            return queue1.poll();
        }
    }

    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();

    }
}
