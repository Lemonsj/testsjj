/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-09
 * Time: 0:31
 **/


/*
* 栈：先进后出
* 队列：先进先出
* */

/*
* 用链表实现队列
* */
class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyQueue {
    public Node head;
    public Node tail;
    public int size = 0;


    public void offer(int data) {
        Node node = new Node(data);
        if(this.tail == null) {
            this.head = node;
        }else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    public int poll(){
        if(size == 0) {
            throw new RuntimeException("队列为空");
        }

        Node oldhead = head;
        head = head.next;

        if(head == null) {
            tail = null;
        }
        size--;
        return oldhead.data;
    }
    public int peek(){
        if(size == 0) {
            throw new RuntimeException("队列为空");
        }

        return head.data;

    }

}
