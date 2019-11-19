/*
class ListNode {
    public int data;
    public ListNode next;
    public ListNode prev;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoubleList {
    public ListNode head;
    public ListNode last;
    public DoubleList () {
        this.head = null;
        this.last = null;
    }
    //删除第一次出现的关键字KEY
    public void remove(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if (cur.data == key) {
                if (cur == this.head) {
                    this.head = cur.next;
                    cur.next.prev = null;
                } else {

                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = cur.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
    }
    //删除出现所有的关键字KEY
    public void removeAll(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if (cur.data == key) {
                if (cur == this.head) {
                    this.head = cur.next;
                    cur.next.prev = null;
                } else {
                    //中间和尾巴
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        this.last = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }


    public void clear() {
        while(this.head != null) {
            ListNode cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.last = null;
    }
}
*/

class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingleList {
    public ListNode head;
    public MySingleList () {
        this.head = null;
    }

    //输入两个链表，找出它们的第一个公共结点
}


