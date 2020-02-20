class Node {
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class MySingleList {

    public Node head;

    public MySingleList() {
        this.head = null;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }

    }
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public Node FindPrev(int index) {
        Node cur = this.head;
        while(index-1 > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    public boolean addIndex(int index,int data) {
        if(index == 0) {
            addFirst(data);
            return true;
        }
        if(index < 0 && index >= size()){
            return false;
        }
        Node node = new Node(data);
        Node prev = FindPrev(index);
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                break;
            }else {
                cur = cur.next;
            }
        }
        if(cur == null) {
            return false;
        }
        return true;

    }
    public Node rePrev(int key) {
        Node cur = this.head;
        while(cur.next != null) {
            if(cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    public void remove(int key) {
        if(this.head.data == key) {
            this.head = null;
        }
        Node prev = rePrev(key);
        prev.next = prev.next.next;
    }
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;

        while(cur != null) {
            if(prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
    public int size() {
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;

    }
    public void display() {
        if(this.head == null) {
            System.out.println("该链表不存在");
            return;
        }
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }

    }
    public void clear1() {
        this.head = null;
    }

    public void clear() {
        while(this.head.next != null) {
            Node cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;
    }
}
