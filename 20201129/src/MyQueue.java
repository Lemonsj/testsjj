/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-29
 * Time: 22:12
 **/
class Node1{
    public int data;
    public Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }

}
public class MyQueue {
    public Node1 front;//队头
    public Node1 rear; //队尾

    public void offer(int val) {
        Node1 node = new Node1(val);
        if(this.front == null) {
            this.front = node;
            this.rear = node;
            return;
        }
        this.rear.next = node;
        this.rear = node;

    }



    public int poll() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空！");
        }
        int data = this.front.data;
        this.front = this.front.next;
        return data;
    }

    public int peek() {
        return -1;
    }

    public Boolean isEmpty() {
        return false;
    }
}
