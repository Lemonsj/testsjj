/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-17
 * Time: 20:45
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Test {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null) {
            return null;
        }
        int lenA = 0;
        int lenB = 0;
        ListNode cur1 = pHead1;//指向较长的链表
        ListNode cur2 = pHead2;
        while(cur1 != null) {
            lenA++;
            cur1 = cur1.next;
        }
        while(cur2 != null) {
            lenB++;
            cur2 = cur2.next;
        }
        cur1 = pHead1;
        cur2 = pHead2;
        int len = lenA-lenB;
        if(len < 0) {
            cur1 = pHead2;
            cur2 = pHead1;
            len = lenB-lenA;
        }
        while(len > 0) {
            cur1 = cur1.next;
            len--;
        }
        while(cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if(cur1 == cur2) {
            return cur1;
        }
        return null;
    }

    public int StrToInt(String str) {
        int length = str.length();
        int number = 0;
        char[] ptr = str.toCharArray();
        if(str.length() == 0) {
            return 0;
        }
        if(ptr[0] == '+' || ptr[0] == '-') {
            for(int i = 1; i < length; i++) {
                if(ptr[i] > '9' || ptr[i] < '0') {
                    return 0;
                }else {
                    number = number*10 + ptr[i] - '0';
                }
            }
            if(ptr[0] == '+') {
                return number;
            }else {
                return (-number);
            }
        }else {
            for(int i = 0; i < length; i++) {
                if(ptr[i] > '9' || ptr[i] < '0') {
                    return 0;
                }else {
                    number = number*10 + ptr[i] - '0';
                }
            }
            return number;
        }
    }


    public static String LeftRotateString(String str,int n) {
        //StringBuffer ptr = new StringBuffer(str);
        String ptr = "";
        String s1 = str.substring(n,ptr.length()-1);
        String s2 = str.substring(0,n);
        ptr = s1+s2;
        return ptr;
    }

    public static void main(String[] args) {
        String str = "abcdefgh";
        System.out.println(LeftRotateString(str, 3));
    }


    public static void main1(String[] args) {
        String str = "abcdefg";
        String ptr = str.substring(0,3);
        System.out.println(ptr);
    }


























}
