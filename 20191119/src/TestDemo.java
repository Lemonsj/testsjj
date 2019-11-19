public class TestDemo {
    public static ListNode midNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode pL = headA;//永远指向最长的单链表
        ListNode pS = headB;//永远指向最短的单链表

        int lenA = 0;
        int lenB = 0;
        //求lenA,lenB的长度
        while(pL != null) {
            lenA++;
            pL = pL.next;
        }
        while(pS != null) {
            lenB++;
            pS = pS.next;
        }
        //求两个链表的长度
        int len = lenA - lenB;
        if(len < 0) {
            pL = headB;
            pS = headA;
            len = lenA - lenB;
        }
        //让较长的链表先走len步
        while(len > 0) {
            pL = pL.next;
            len--;
        }
        //让pL和pL一人走一步
        while(pL != pS) {
            pS = pS.next;
            pL = pL.next;
        }
        return pL;
    }
    public static void main(String[] args) {

    }
}
