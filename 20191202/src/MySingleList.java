class ListNode {
    public int data;
    public ListNode next;
    public ListNode (int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingleList {
    public ListNode head;
    public MySingleList() {
        this.head = null;
    }
    public void diaplay() {
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
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        ListNode cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    public int getSize() {
        ListNode cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public ListNode IndexPrev(int index) {
        int count = 0;
        ListNode prev = this.head;
        while(count < index-1) {
            prev = prev.next;
            count++;
        }
        return prev;
    }
    //任意位置插入,第一个数据节点为0号下标    
    public boolean addIndex(int index,int data) {
        if(index < 0 || index > getSize()) {
            return false;
        }

        if(index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = IndexPrev(index);
        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    public ListNode searchPrev(int key) {
        ListNode prev = this.head;
        while(prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            }
        }
        return null;
    }

    //删除第一次出现的key
    public void remove(int key) {
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        ListNode prev = searchPrev(key) ;
        if(prev == null) {
            System.out.println("没有要删除的节点");
            return;
        }
        prev.next = prev.next.next;
    }
    //删除所有结点
    /*public void removeAllKeys(int key) {

    }*/
}
