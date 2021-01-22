import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-22
 * Time: 18:00
 **/

public class Test {

    public static ListNode plusAB1(ListNode a, ListNode b) {
        // write code here
        ListNode tmp = new ListNode(-1);
        ListNode head = tmp;
        int val;
        int Sw = 0;
        while(a != null || b != null || Sw == 1) {
            int aval = a == null ? 0 : a.val;
            int bval = b == null ? 0 : b.val;
            val = aval + bval + Sw;
            Sw = val/10;
            val = val%10;
            tmp.next = new ListNode(val);
            tmp = tmp.next;

            a = a == null ? null : a.next;
            b = b == null ? null : b.next;
        }
        return head.next;
    }


    public static void main1(String[] args) {
        MySingleList mySingleList1 = new MySingleList();
        mySingleList1.addFirst(3);
        mySingleList1.addFirst(2);
        mySingleList1.addFirst(1);

        MySingleList mySingleList2 = new MySingleList();
        mySingleList2.addFirst(1);
        mySingleList2.addFirst(2);
        mySingleList2.addFirst(3);

        //ListNode result = plusAB(mySingleList1,mySingleList2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] tanzhu  = br.readLine().toCharArray();
        char[] xiaohong = br.readLine().toCharArray();
        boolean[] tz = new boolean[tanzhu.length];
        boolean[] xh = new boolean[xiaohong.length];

        int lack = 0;
        for(int i = 0; i < xiaohong.length; ++i) {
            for(int j = 0; j < tanzhu.length; ++j) {
                if(false == tz[j] && xiaohong[i] == tanzhu[j]) {
                    xh[i] = tz[j] = true;
                    break;
                }
            }
            if(false == xh[i]) {
                ++lack;
            }
        }
        if (lack > 0) {
            System.out.println("No" + " " + lack);
        } else {
            System.out.println("Yes" + " " + (tanzhu.length - xiaohong.length));
        }
    }
}
