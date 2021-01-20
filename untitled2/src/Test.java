import java.util.Arrays;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-20
 * Time: 17:59
 **/
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,2};
        int n = 5;
        //int ret = getValue(array,n);
        int ret = getValue1(array,n);
        System.out.println(ret);
    }


    public static int getValue(int[] gifts, int n) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int num = n/2;
        int size = 0;
        for(int i = 0; i < n; i++){
            if(map.containsValue(gifts[i])) {
                map.put(gifts[i],size++);

            }else{
                map.put(gifts[i],size);
            }
        }
        int i = 0;
        for(i = 0; i < map.size(); i++) {
            if(map.get(gifts[i]) > num) {
                return gifts[i];
            }
        }
        return 0;
    }

    public static int  getValue1(int[] gifts,int n) {
        Arrays.sort(gifts);
        int t = gifts[n/2];
        int num = 0;
        for(int i = 0; i < gifts.length; i++) {
            if(gifts[i] == t) {
                num++;
            }
        }
        return num <= 2 ? 0 : t;
    }

    public ListNode partition(ListNode pHead, int x) {
        // write code here
        /*ListNode s1s = null;
        ListNode s1e = null;
        ListNode s2s = null;
        ListNode s2e = null;
        ListNode cur = pHead;
        while(cur != null) {
            if(cur.val < x) {
                if(s1s == null) {
                    s1s = cur;
                    s1e = s1s;
                }else {
                    s1e.next = cur;
                    s1e = s1e.next;
                }
            }else {
                if(s2s == null) {
                    s2s = cur;
                    s2e = s2s;
                }else {
                    s2e.next = cur;
                    s2e = s2e.next;
                }
            }
            cur = cur.next;
        }
        s2e.next = null;
        if(s1s == null) {
            return s2s;
        }
        if(s2s == null) {
            s1e.next = null;
            return s1s;
        }
        s1e.next = s2s;
        return s1s;*/
        if(pHead != null){
            ListNode cur = pHead;
            ListNode flag = null;
            //因为链表中可能有多个满足条件的结点，故使用循环
            while(cur.next != null){
                if(cur == pHead && cur.val < x){
                    flag = cur;
                }
                if(cur.next.val < x){
                    if(flag != cur){
                        ListNode tmp = cur.next;
                        cur.next = tmp.next;
                        if(flag == null){
                            tmp.next = pHead;
                            pHead = tmp;
                        }else{
                            tmp.next = flag.next;
                            flag.next = tmp;
                        }
                        flag = tmp;
                    }else{
                        cur = cur.next;
                        flag = cur;
                    }
                }else{
                    cur = cur.next;
                }
            }
        }
        return pHead;
    }
}
