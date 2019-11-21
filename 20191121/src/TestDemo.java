/*
public class TestDemo {
    //删除一个（已排序）链表中重复的结点
    public ListNode removeRepetition() {
        ListNode cur = this.head;
        ListNode newhead = new ListNode(-1);
        ListNode tmp = newhead;
        while(cur != null) {
            //重复的节点
            if(cur.next != null && cur.data == cur.next.data) {
                //每一次都需要判断cur.next
                while(cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = cur;
                cur = cur.next;
            }
        }
        return newhead.next;
    }
    // 给定一个带有头结点 head 的非空单链表，返回链表的中间结点
    public ListNode findMid() {
        if(this.head == null) {
            return null;
        }
        ListNode cur = this.head;
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //判断一个链表是否为回文结构（Java实现）
    public boolean chkPalindrome() {
        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }
        //1、找中间结点
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        //2、反转单链表
        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3、fast/slow往前走  head往后走
        while(slow != this.head) {
            if(slow.data != this.head.data) {
                return false;
            }
            if(this.head.next == slow) {
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        return true;
    }
}
*/
