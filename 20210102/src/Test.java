/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-02
 * Time: 22:06
 **/
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Test {
    public boolean isPail (ListNode head) {
        // write code here
        if(head == null) {
            return false;
        }
        if(head.next == null) {
            return true;
        }
        //找中间节点
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //反转单链表
        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while(slow != head) {
            if(slow.val != head.val) {
                return false;
            }
            if(head.next == slow) {
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
