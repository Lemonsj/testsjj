/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-24
 * Time: 18:01
 **/
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class MyLinkedList {
    public Node head;
    public Node tail;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    //打印
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //尾插法

    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            addFirst(data);
            return;
        }
        this.tail.next = node;
        node.prev = this.tail;
        this.tail = this.tail.next;
    }

    //查找是否包含关键字key是否在单链表中
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public int size() {
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("下标不合法");
        }
    }

    private Node searchIndex(int index) {
        Node cur = this.head;
        while(index != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //插入到Index位置
    public void addIndex(int index,int data) {

        checkIndex(index);

        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }

        Node node = new Node(data);

        Node cur = searchIndex(index);
        cur.prev.next = node;
        node.next = cur;
        node.prev = cur.prev;
        cur.prev = node;
    }


    //返回要删除的节点
    public int remove(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                if(cur == this.head) {
                    head = head.next;
                    head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }


    public void removeAllKey(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                if(cur == this.head) {
                    this.head = this.head.next;
                    if(this.head != null) {
                        this.head.prev = null;
                    }
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    public void clear() {
        while(this.head != null) {
            Node cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
    }


}
