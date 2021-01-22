/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-22
 * Time: 18:25
 **/
class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class MySingleList {
    public ListNode head;
    public MySingleList() {
        this.head = null;
    }

    public void addFirst(int val) {
        ListNode node = new ListNode(val);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
}
