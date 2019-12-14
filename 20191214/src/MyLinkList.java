class Node {
    public int val;
    public Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class MyLinkedList {
    public Node head;
    public Node rear;

    public MyLinkedList() {
        this.head = null;
        this.rear = null;
    }

    public int getlen() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public int get(int index) {
        if (index < 0 || index < getlen()) {
            return -1;
        }
        Node cur = this.head;
        while (index-- >= 0) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.rear = this.head;
        }
        node.next = this.head;
        this.head = node;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.rear = this.head;
        }
        this.rear.next = node;
        this.rear = node;
    }

    public void addAtIndex(int index, int val) {
        if (index == getlen()) {
            addAtTail(val);
            return;
        }

        if (index > getlen()) {
            return;
        }
        if (index < 0) {
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        Node cur = this.head;
        while (index-- > 0) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index < getlen()) {
            return;
        }
        Node cur = this.head;
        while (index-- > 0) {
            cur = cur.next;
        }
        Node del = cur.next;
        cur.next = del.next;
    }
}

