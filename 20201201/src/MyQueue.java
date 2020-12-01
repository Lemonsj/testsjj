/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-01
 * Time: 15:06
 **/
class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = next;
    }

}
public class MyQueue {
    private Node front;//队头
    private Node rear;//队尾

    //添加元素
    public void offer(int val) {
        Node node = new Node(val);
        if(this.front == null) {
            this.front = node;
            this.rear = node;
            return;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
    }
    //删除队头元素
    public int poll() {
        if(isEmpty()) {
            throw new RuntimeException("队列已空！");
        }
        int num = this.front.data;
        this.front = this.front.next;
        return num;
    }
    //取出队尾元素
    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("队列已空！");
        }
        int num = this.front.data;
        return num;
    }
    //判断队列是否已满
    public Boolean isEmpty() {
        if(this.front == null) {
            return null;
        }else {
            return false;
        }

    }
}
