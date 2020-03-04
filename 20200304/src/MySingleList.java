class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MySingleList {

    public ListNode head;
    public MySingleList() {
        this.head = null;
    }

    public boolean hasCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        /*while(fast != null) {
            if(fast != slow) {
                fast = fast.next.next;
                slow = slow.next;
            }else {
                break;
            }
        }
        if(fast == slow) {
            return true;
        }
        return false;*/

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return false;
        }
        return true;
    }

    public ListNode detectCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        slow = this.head;
        while(fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
