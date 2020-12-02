/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-02
 * Time: 16:46
 **/
class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedQueue {
    private Node front;
    private Node rear;
    private int usedSize;

    public void offer(int data) {
        Node node = new Node(data);
        if(Empty()) {
            this.front = node;
            this.rear = node;
            return;
        }
        this.rear.next = node;
        this.rear = node;
        this.usedSize++;
    }

    public int poll() {
        if(Empty()) {
            throw new RuntimeException("队列已空！");
        }
        int data = this.front.data;
        this.front = this.front.next;
        this.usedSize--;
        return data;
    }

    public int peek() {
        if(Empty()) {
            throw new RuntimeException("队列已空！");
        }
        int data = this.front.data;
        //this.front = this.front.next;
        return data;

    }

    public Boolean Empty() {
        /*if(this.front == null) {
            return true;
        }
        return false;*/
        return this.usedSize == 0;
    }
}
