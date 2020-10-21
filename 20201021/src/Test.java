/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-21
 * Time: 19:42
 **/
public class Test {
    public static void main(String[] args) {
        /*public ListNode reverseList(ListNode head) {
            ListNode cur = head;
            ListNode prev = null;
            ListNode newHead = null;
            while(cur != null) {
                ListNode curNext = cur.next;
                if(curNext == null){
                    newHead = cur;
                }
                cur.next = prev;
                prev = cur;
                cur = curNext;
            }
            return newHead;
        }


        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }



        public ListNode FindKthToTail(ListNode head,int k) {
            if(k <= 0) {
                return null;
            }
            if(head == null) {
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;
            while(k-1 > 0) {
                if(fast.next != null) {
                    fast = fast.next;
                    k--;
                }else {
                    return null;
                }
            }
            while(fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }

        public ListNode partition(ListNode pHead, int x) {
            // write code here
            ListNode cur = pHead;
            ListNode bs = null;
            ListNode be = null;
            ListNode as = null;
            ListNode ae = null;
            while(cur != null) {
                if(cur.val < x) {
                    if(bs == null) {
                        bs = cur;
                        be = bs;
                    }else {
                        be.next = cur;
                        be = be.next;
                    }
                }else {
                    if(as == null) {
                        as = cur;
                        ae = as;
                    }else {
                        ae.next = cur;
                        ae = ae.next;
                    }
                }
                cur = cur.next;
            }
            if(bs == null) {
                return as;
            }
            if(as == null) {
                return bs;
            }
            be.next = as;
            ae.next = null;
            return bs;
        }*/

























    }
}
