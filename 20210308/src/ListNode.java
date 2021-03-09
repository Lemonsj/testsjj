/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-08
 * Time: 19:52
 **/
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Demo{
    ListNode head;
    public Demo(){
        this.head = null;
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null) {
            if(cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(head.val == val) {
            head = head.next;
        }
        return head;
    }


    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }

    public ListNode middleNode(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if(k <= 0 || head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(k-1 > 0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                return null;
            }
        }

        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode cur = pHead;
        ListNode ps = null;
        ListNode pe = null;
        ListNode qs = null;
        ListNode qe = null;
        while(cur != null) {
            if(cur.val < x) {
                if(ps == null) {
                    ps = cur;
                    pe = cur;
                }else {
                    pe.next = cur;
                    pe = pe.next;
                }
            }else {
                if(qs == null) {
                    qs = cur;
                    qe = cur;
                }else{
                    qe.next = cur;
                    qe = qe.next;
                }
            }
            cur = cur.next;
        }
        if(ps == null){
            return qs;
        }
        if(qs == null) {
            return ps;
        }
        pe.next = qs;
        if(qs != null){
            qe.next = null;
        }
        return ps;
    }

    public ListNode deleteDuplication(ListNode pHead){
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
                tmp = tmp.next;
                cur = cur.next;

            }
        }
        tmp.next = null;
        return newHead.next;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        int lenA = 0;
        int lenB = 0;
        ListNode pl = headA;
        ListNode ps = headB;
        while(pl != null){
            lenA++;
            pl = pl.next;
        }
        while(ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA-lenB;
        if(len < 0) {
            pl = headB;
            ps = headA;
            len = lenB-lenA;
        }
        while(len > 0) {
            pl = pl.next;
            len--;
        }
        while(pl != ps) {
            pl = pl.next;
            ps = ps.next;
        }
        return pl;
    }
}

