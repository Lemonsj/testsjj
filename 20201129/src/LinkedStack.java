import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-29
 * Time: 15:06
 **/
class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }
    public Node(int data,Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
//栈：先进的后出
public class LinkedStack {
    //入栈采用头插法
    private Node top;

    public LinkedStack() {
        this.top = null;
    }

    public Boolean isEmpty() {
        return top == null;
    }

    public void push(int val) {
        Node node = new Node(val);
        if(isEmpty()) {
            top = node;
        }else {
            node.setNext(top);
            top = node;
        }
    }

    public void pop() {
        if(isEmpty()) {
            throw new RuntimeException("当前链表为空");
        }

        top = top.getNext();
    }
}
