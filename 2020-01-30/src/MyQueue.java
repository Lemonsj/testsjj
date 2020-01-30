class Node {
    int val;
    Node next;
    public Node (int val,Node next) {
        this.val = val;
        this.next = next;
    }
    public Node(int val) {
        this.val = val;
    }

}
public class MyQueue {
    private Node head;
    private Node tail = null;
    private int size;
    public MyQueue(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }
    public void offer(int val) {
        Node node = new Node(val);
        if(tail == null) {
            this.head = node;
        }else {
            this.tail.next = node;
        }
        this.tail = node;
        this.size++;
    }
    public int poll() {
        if(this.size == 0) {
            throw new RuntimeException("队列为空");
        }
        Node oldHead = this.head;
        this.head = head.next;
        if(this.head == null) {
            this.tail = null;
        }
        this.size--;
        return oldHead.val;
    }
    public int peek() {
        if(this.size == 0) {
            throw new RuntimeException("队列为空");
        }
        return this.head.val;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size(){
        return size;
    }
}
