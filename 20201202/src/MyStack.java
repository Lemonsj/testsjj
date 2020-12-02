import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-02
 * Time: 17:00
 **/
public class MyStack {
    //队列先进先出
    //栈先进后出
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    //queue1放数据，queue2临时地儿
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
        if(empty()) {
            return -1;
        }
        int tmp = 0;
        if(!queue1.isEmpty()) {
            while(!queue1.isEmpty()) {
                tmp = queue1.poll();
                if(!queue1.isEmpty()) {
                    queue2.add(tmp);
                }

            }
        }else{
            while(!queue2.isEmpty()) {
                tmp = queue2.poll();
                if(!queue2.isEmpty()) {
                    queue1.add(tmp);
                }

            }
        }
        return tmp;
    }

    public int top(){
        if(empty()) {
            return -1;
        }
        int tmp = 0;
        if(!queue1.isEmpty()) {
            while(!queue1.isEmpty()) {
                tmp = queue1.poll();
                queue2.add(tmp);

            }
        }else{
            while(!queue2.isEmpty()) {
                tmp = queue2.poll();
                queue1.add(tmp);

            }
        }
        return tmp;
    }

    public Boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;
    }
}
