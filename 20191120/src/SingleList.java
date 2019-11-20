class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class SingleList {
    public ListNode head;
    public SingleList() {
        this.head = null;
    }
    public void display() {
        ListNode cur = this.head;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }

    }
    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head == null) {
            this.head = node;
        }else {
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }

    }
    //以给定值x为基准将链表分割成两部分
    public ListNode partition(int x) {
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data < x) {
                //判断是不是第一次插入
                if(bs == null) {
                    bs = cur;
                    be = cur;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if(as == null) {
                    as = cur;
                    ae = cur;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //判断第一部分是否有数据
        if(bs == null) {
            return as;
        }
        be.next = as;
        return bs;
    }
    public void display2(ListNode newhead) {
        ListNode cur = newhead;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    //删除一个（已排序）链表中重复的结点
    public ListNode removeRepetition() {
        ListNode cur = this.head;
        ListNode newhead = new ListNode(-1);
        ListNode tmp = newhead;
        while(cur != null) {
            //重复的节点
            if(cur.next != null && cur.data == cur.next.data) {
                //每一次都需要判断cur.next
                while(cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                tmp = cur;
                cur = cur.next;
            }
        }
        return newhead.next;
    }
    // 给定一个带有头结点 head 的非空单链表，返回链表的中间结点
    public ListNode findMid() {
        if(this.head == null) {
            return null;
        }
        ListNode cur = this.head;
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //判断一个链表是否为回文结构（Java实现）
   public boolean chkPalindrome() {
        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }
        //1、找中间结点
       ListNode fast = this.head;
       ListNode slow = this.head;
       while(fast != null && fast.next != null) {
           fast = fast.next.next;
           slow = slow.next;

       }
       //2、反转单链表
       ListNode cur = slow.next;
       while(cur != null) {
           ListNode curNext = cur.next;
           cur.next = slow;
           slow = cur;
           cur = curNext;
       }
       //3、fast/slow往前走  head往后走
       while(slow != this.head) {
           if(slow.data != this.head.data) {
               return false;
           }
           if(this.head.next == slow) {
               return true;
           }
           slow = slow.next;
           this.head = this.head.next;
       }
       return true;
    }

}
