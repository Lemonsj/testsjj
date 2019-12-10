public class MyListQueue {
    static class Node{
        public int data;
        public Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public Node front;
    public Node rear;
    public int usedsize;
    public boolean is_empty() {
        return this.usedsize == 0;
    }
    //入队
    public void offer(int data) {
        Node node = new Node(data);
        if(is_empty()) {
            this.front = node;
            this.rear = front;
        }else {
            this.rear.next = node;
            this.rear = node;
        }
        this.usedsize++;
    }
    //出队
    /*public int poll() {

    }
    public int peek() {

    }*/

}
