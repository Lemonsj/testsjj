import java.util.LinkedList;
import java.util.Queue;
public class MyStack {
    public Queue<Integer> queue1;
    public Queue<Integer> queue2;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int x) {
        if(!queue1.isEmpty()) {
            queue1.offer(x);
        }else if(!queue2.isEmpty()){
            queue2.offer(x);
        }else {
            queue1.offer(x);
        }
    }
    public int top() {
        if(!queue1.isEmpty()) {
            int tmp1 = 0;
            int size1 = queue1.size();
            for(int i = 0; i < size1; i++ ) {
                tmp1 = queue1.poll();
                queue2.offer(tmp1);
            }
            return tmp1;
        }
        if(!queue2.isEmpty()) {
            int tmp2 = 0;
            int size2 = queue2.size();
            for(int i = 0; i < size2; i++ ) {
                tmp2 = queue2.poll();
                queue1.offer(tmp2);
            }
            return tmp2;
        }
        return -1;

    }
    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty()){
            return true;
        }
        return false;

    }
}
