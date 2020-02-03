import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    public Queue<Integer> queue1;
    public Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int x) {
        if(!queue1.isEmpty()) {
            queue1.offer(x);
        }else if(!queue2.isEmpty()) {
            queue2.offer(x);
        }else {
            queue1.offer(x);
        }
    }
    public int pop() {
        if(!queue1.isEmpty()) {
            int size1 = queue1.size()-1;
            for(int i = 0; i < size1; i++) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        }
        if(!queue2.isEmpty()) {
            int size2 = queue2.size()-1;
            for(int i = 0; i < size2; i++ ) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }
        return -1;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int size1 = array.length;
        String str = "abcdef";
        int size2 = str.length();

    }
}
