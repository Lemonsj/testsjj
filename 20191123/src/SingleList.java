import java.util.List;

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

    //打印
    public void display() {
        if (this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            ListNode cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //链表长度
    public int getLength() {
        ListNode cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public ListNode searchIndex(int index) {
        ListNode prev = this.head;
        int count = 0;
        while (count < index - 1) {
            prev = prev.next;
            count++;
        }
        return prev;
    }

    //任意位置插入，第一个位置为0
    public boolean addIndex(int index, int data) {
        if (index < 0 || index > getLength()) {
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    //查找链表是否包含关键字key
    public boolean contains(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的结点
    public void remove(int key) {
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        ListNode prev = searchPrev(key);
        prev.next = prev.next.next;
    }
    //删除所有值为key的结点
    public void removeAllkey(int key) {
        ListNode prev = this.head;
        ListNode cur = this.head;
        while(cur != null) {
            if(prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head= this.head.next;
        }
    }
    //清空链表
    public void clear() {
        //this.head = null;

        while(this.head.next != null) {
            ListNode cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;
    }
    //反转链表
    public ListNode reserveList() {
        ListNode cur = this.head;
        ListNode prev = null;
        ListNode newHead = null;
        while(cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    public void display2(ListNode newHead) {
        if(newHead == null) {
            return;
        }
        ListNode cur = newHead;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    //返回中间结点
    public ListNode middleNode(){
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //输出链表中倒数第k个结点
    public ListNode lasthK(int k) {
        if(k < 0) {
            return null;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(k-1 > 0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else{
                System.out.println("该节点不存在！");
                return null;
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    //将两个有序链表合并为一个新的有序链表并返回
    /*public ListNode combineList(ListNode headA, ListNode headB) {

    }*/

    //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public ListNode divisionList(int x) {
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.data < x) {
                if(bs == null) {
                    bs = cur;
                    be = bs;
                    //cur = cur.next;
                }else {
                    be.next = cur;
                    be = be.next;
                    //cur = cur.next;
                }
            }else {
                if(as == null) {
                    as = cur;
                    ae = as;
                    //cur = cur.next;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                    //cur = cur.next;
                }
            }
            cur = cur.next;
        }
        if(bs == null) {
            return as;
        }
        be.next = as;
        if(as != null) {
            ae.next = null;
        }
        return bs;
    }
    //在排序链表中，删除重复的结点
    public ListNode removeRepetition(){
        ListNode cur = this.head;
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while(cur != null) {
            if(cur.next != null && cur.data == cur.next.data) {
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
        return newHead;
    }
    //判断是否是回文结构
    public boolean chkPalindrome() {
        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }
        //找中间结点
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //反转后半部分
        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //两边同时往中间走
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
    //输入两个链表，找出它们的第一个公共结点
    public ListNode pnode(ListNode headA, ListNode headB){
        ListNode pL = headA;
        ListNode pS = headB;
        int lenA = 0;
        int lenB = 0;
        while(pL != null) {
            lenA++;
            pL = pL.next;
        }
        while(pS != null){
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;
        int len = 0;
        if(lenA > lenB) {
            len = lenA - lenB;
        }else {
            len = lenB - lenA;
            pL = headB;
            pS = headA;
        }
        while(len > 0) {
            pL = pL.next;
            len--;
        }
        while(pL != pS) {
            pL = pL.next;
            pS = pS.next;
        }
        return pL;
    }
    public void createLoop(){
        ListNode cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = this.head.next.next;
    }
    //给定一个链表，判断链表中是否有环
    public boolean hasCircle() {
        if(this.head == null) {
            return false;
        }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public boolean detectCircle() {
        if(this.head == null) {
            return false;
        }
        ListNode fast = tis.head;
        ListNode slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
}



