/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-08
 * Time: 16:13
 **/
class Node{
    public int val;
    public Node next;

    public Node(int data) {
        this.val = data;
        this.next = null;
    }
}
// 1、无头单向非循环链表实现
public class SingleLinkedList {
    public Node head;

    public SingleLinkedList() {
        this.head = null;
    }
     //头插法
     public void addFirst(int data) {
         Node node = new Node(data);
         if(this.head == null) {
             this.head = node;
         }else {
             node.next = this.head;
             this.head = node;
         }
     }
     //尾插法
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
     public Node rePrev(int data) {
        Node cur = this.head;
        while(cur.next != null) {
            if(cur.next.val == data) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
     }
    public Node findPrev(int index) {
        Node cur = this.head;
        while(index -1 > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
     //任意位置插入,第一个数据节点为0号下标
     public boolean addIndex(int index,int data) {
        if(index == 0) {
            addFirst(data);
            return true;
        }
        Node node = new Node(data);
         if(index > size() || index < 0) {
             return false;
         }
         Node prev = findPrev(index);
         if(prev == null) {
             return false;
         }
         node.next = prev.next;
         prev.next = node;
         return true;
     }
     //查找是否包含关键字key是否在单链表当中
     public boolean contains(int key) {
        Node cur = this.head;
        while(cur.next != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
     }
     //删除第一次出现关键字为key的节点
     public void remove(int key) {
        if(this.head.val == key) {
            this.head = null;
        }
        Node prev = findPrev(key);
        prev.next = prev.next.next;

     }
     //删除所有值为key的节点
     public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null) {
            if(cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.val == key) {
            this.head = this.head.next;
        }

     }
     //得到单链表的长度
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
        if(this.head  == null) {
            System.out.println("该链表不存在!");
            return;
        }
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
     }
     public void clear() {
        this.head = null;
     }
}
