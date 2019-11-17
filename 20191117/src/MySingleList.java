class ListNode {
    public int data;
    public ListNode next;
    public ListNode prev;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
    public class MySingleList {
        ListNode head;
        ListNode last;//尾巴

        public MySingleList() {
            this.head = null;
            this.last = null;
        }

        //头插法
        public void addFirst(int data) {
            ListNode node = new ListNode(data);
            if (this.head == null) {
                this.head = node;
                this.last = node;
            } else {
                node.next = this.head;
                this.head.prev = node;
                this.head = node;
                //this.head.prev = null;
            }
        }


        //尾插法
        public void addLast(int data) {
            ListNode node = new ListNode(data);
            if (this.head == null) {
                this.head = node;
                this.last = node;
            } else {
                this.last.next = node;
                //node.next = null;
                node.prev = this.last;
                this.last = node;
            }
        }

        public void display() {
            if (this.head == null) {
                System.out.println("该链表不存在！");
                return;
            } else {
                ListNode cur = this.head;
                while (cur != null) {
                    System.out.println(cur.data);
                    cur = cur.next;
                }
            }
        }


        private ListNode searchIndex(int index) {
            if (index < 0 || index >= size()) {
                return null;
            }
            ListNode cur = this.head;
            while (index > 0) {
                cur = cur.next;
                index--;
            }
            return cur;
        }

        //任意位置插入,第一个数据节点为0号下标
        public boolean addIndex(int index, int data) {
            ListNode node = new ListNode(data);
            if (index == 0) {
                addFirst(data);
                return true;
            }
            if (index == size()) {
                addLast(data);
                return true;
            }
            ListNode cur = searchIndex(index);
            if (cur == null) {
                return false;
            }


            cur.prev.next = node;
            node.next = cur;
            node.prev = cur.prev;
            cur.prev = node.prev;
            return true;
        }

        //return false;
        //得到单链表的长度
        public int size() {
            ListNode cur = this.head;
            int count = 0;
            while (cur != null) {
                count++;
                cur = cur.next;
            }
            return count;
        }

        //查找是否包含关键字key是否在单链表当中
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
        public void clear() {
            while(this.head != null) {
                ListNode cur = this.head.next;
                this.head.prev = null;
                this.head.next = null;

            }
        }

        //删除第一次出现关键字为key的节点
        public void remove(int key) {
            ListNode cur = this.head;
            while (cur != null) {
                if (cur.data == key) {
                    if (cur == this.head) {
                        this.head = this.head.next;
                        this.head.prev = null;
                    } else {
                        //中间和尾巴
                        cur.prev.next = cur.next;
                        if (cur.next != null) {
                            cur.next.prev = cur.prev;
                        } else {
                            this.last = cur.prev;
                        }
                    }

                } else {
                    cur = cur.next;
                }
            }
        }
         //删除所有值为key的节点
         public void removeAllKey(int key) {

         }
    }


/*class MySingleList {
    public ListNode head;

    public MySingleList() {
        this.head = null;
    }
    public ListNode reseveList() {
        ListNode cur = this.head;
        ListNode newHead = null;
        ListNode prev = null;
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
}*/
