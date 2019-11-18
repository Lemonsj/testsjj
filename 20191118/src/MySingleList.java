class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingleList {
    ListNode head;
    public MySingleList () {
        this.head = null;
    }
    // 头插法    
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            return;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    // 尾插法    
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            return;
        }else {
            ListNode cur = this.head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
            //node.next = null;
        }
    }

    public ListNode searchIndex(int index) {
        ListNode prev = this.head;
        int count = 0;
        while(count < index-1) {
            prev = prev.next;
            count++;
        }
        return  prev;
    }
    public int getlength() {
        ListNode cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    // /任意位置插入,第一个数据节点为0号下标    
    public boolean addIndex(int index,int data) {
        if(index < 0 || index > getlength()) {
            System.out.println("该位置不合法！");
            return false;
        }
        if(index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next =  node;
        return true;
    }
    // 查找是否包含关键字key是否在单链表当中    
    public boolean contains(int key) {
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
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
    // 删除第一次出现关键字为key的节点    
    public void remove(int key) {
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        ListNode prev = searchPrev(key);
        if(prev == null) {
            System.out.println("没有该节点");
            return;
        }
        prev.next = prev.next.next;
        /*if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //找前驱
        ListNode prev = searchPrev(key);
        if(prev == null) {
            System.out.println("没有要删除的节点！");
            return;
        }
        prev.next = prev.next.next;*/
}
    // 删除所有值为key的节点    
    public void removeAllKey(int key) {
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while(cur != null) {
            if(prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head;
        }
        /*ListNode prev = this.head;
        ListNode cur = this.head.next;
        while(cur != null) {
            if(prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
*/
    }
    // 得到单链表的长度       
    public void display() {
        ListNode cur = this.head;
        while(cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
    public void clear() {
        //this.head = null;
        while (this.head.next != null) {
            ListNode cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;
    }

    //反转一个单链表
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
            cur = cur.next;
        }
        return newHead;
    }
    // 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点
    public ListNode findmid() {
        ListNode fast = this.head;
        ListNode slow = this.head;

    }

}
