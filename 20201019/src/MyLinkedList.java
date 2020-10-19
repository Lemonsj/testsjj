/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-19
 * Time: 16:39
 **/
class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    public Node head;
    //打印
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
             this.head = node;
             return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
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

    //任意位置插入
    public boolean addIndex(int index,int data) {
        if(index <0 || index > size()) {
            return false;
        }
        if(index == 0) {
            addFirst(data);
            return true;
        }
        if(index == size()) {
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        Node cur = this.head;
        while(index-1 > 0) {
            cur = cur.next;
            index--;
        }
        node.next = cur.next;
        cur.next = node;
        return true;
    }

    //查找是否包含关键字KEY是否在链表中
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

    private Node searchPrev(int key) {
        Node prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    //删除第一次出现关键字为KEY的节点
    public void remove(int key) {

        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                break;
            }
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    //删除所有值为KEY的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null) {
            if(cur.data == key) {
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

    public void clear() {
        this.head = null;
    }


}
