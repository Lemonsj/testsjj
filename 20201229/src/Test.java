/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-29
 * Time: 23:36
 **/
class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class Test {
    public int getHigh(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = getHigh(root.left);
        int right = getHigh(root.right);
        return left > right ? left+1 : right+1;
    }
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null) {
            return true;
        }
        int left = getHigh(root.left);
        int right = getHigh(root.right);
        return Math.abs(left-right) < 2 && IsBalanced_Solution(root.left)
                && IsBalanced_Solution(root.right);
    }
    public static void main1(String[] args) {
        int x = 0;
        int y = 0;
        Math.abs(x-y);
    }

    //***************
    public ListNode mergeKLists1(ListNode[] lists) {
        ListNode res = new ListNode(0);  //设置结果
        if(lists == null || lists.length < 0){
            return null;
        }else if(lists.length == 1){
            return lists[0];
        }else if(lists.length == 2){
            mergeTwoLists1(lists[0],lists[1]);
        }else{
            res = mergeTwoLists1(lists[0],lists[1]);
            for(int i = 2; i < lists.length;i++){
                mergeTwoLists1(res,lists[i]);
            }
        }
        return res;
    }

    public ListNode mergeTwoLists1(ListNode l1,ListNode l2){
        ListNode res = new ListNode(0);
        ListNode tmp = res;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tmp.next = l1;
                l1 = l1.next;
            }else{
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        //后面是为了补全的，因为链表的长度可能不一样
        if(l1 != null){
            tmp.next = l1;
        }else{
            tmp.next = l2;
        }
        return res.next;
    }
    //***************
    //使用优先级队列
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);  //设置结果
        if(lists == null || lists.length < 0){
            return null;
        }else if(lists.length == 1){
            return lists[0];
        }else if(lists.length == 2){
            mergeTwoLists(lists[0],lists[1]);
        }else{
            res = mergeTwoLists(lists[0],lists[1]);
            for(int i = 2; i < lists.length;i++){
                mergeTwoLists(res,lists[i]);
            }
        }
        return res;
    }

    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode res = new ListNode(0);
        ListNode tmp = res;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tmp.next = l1;
                l1 = l1.next;
            }else{
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }
        //后面是为了补全的，因为链表的长度可能不一样
        if(l1 != null){
            tmp.next = l1;
        }else{
            tmp.next = l2;
        }
        return res.next;
    }
}
