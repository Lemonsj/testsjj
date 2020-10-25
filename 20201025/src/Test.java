/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-25
 * Time: 22:09
 **/
public class Test {


    public static void main(String[] args) {

    }

    /*
    * public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        ListNode cur = pHead;
        while(cur != null) {
            if(cur.next != null && cur.val == cur.next.val) {
                while(cur.next != null && cur.val == cur.next.val) {
                     cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp =tmp.next;
                cur = cur.next;
            }
        }
        tmp.next = null;
        return newHead.next;
    }



    public boolean chkPalindrome(ListNode A) {
        // write code here
        if(A == null) {
            return false;
        }
        if(A.next == null) {
            return true;
        }
        ListNode fast = A;
        ListNode slow = A;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while(slow != A) {
            if(A.val != slow.val) {
                return false;
            }
            if(A.next == slow) {
                return true;
            }
            A = A.next;
            slow = slow.next;
        }
        return true;
    }



    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode cur = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                while(cur != slow) {
                    cur = cur.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pl = headA;
        ListNode ps = headB;
        int lenA = 0;
        int lenB = 0;
        while(pl != null) {
            lenA++;
            pl = pl.next;
        }
        while(ps != null) {
            lenB++;
            ps = ps.next;
        }
        int len = lenA-lenB;
        pl = headA;
        ps = headB;
        if(len < 0) {
            len = lenB-lenA;
            pl = headB;
            ps = headA;
        }
        while(len > 0) {
            pl = pl.next;
            len--;
        }
        while(pl != ps && pl != null && ps != null) {
            pl = pl.next;
            ps = ps.next;
        }
        return ps;
    }



    *
    * */
}
