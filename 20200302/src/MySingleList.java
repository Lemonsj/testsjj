class Node {
    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public Node() {
    }
}

public class MySingleList {

    public Node head;

    public MySingleList() {
        this.head = null;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }

    }
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        }else {
            Node cur = this.head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }

    }

    public Node FindPrev(int index) {
        Node cur = this.head;
        while(index-1 > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    public boolean addIndex(int index,int data) {
        if(index == 0) {
            addFirst(data);
            return true;
        }
        if(index < 0 && index >= size()){
            return false;
        }
        Node node = new Node(data);
        Node prev = FindPrev(index);
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                break;
            }else {
                cur = cur.next;
            }
        }
        if(cur == null) {
            return false;
        }
        return true;

    }
    public Node rePrev(int key) {
        Node cur = this.head;
        while(cur.next != null) {
            if(cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    public void remove(int key) {
        if(this.head.data == key) {
            this.head = null;
        }
        Node prev = rePrev(key);
        prev.next = prev.next.next;
    }
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;

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
    }
    public int size() {
        int count = 0;
        Node cur = this.head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;

    }
    public void display() {
        if(this.head == null) {
            System.out.println("该链表不存在");
            return;
        }
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }

    }
    public void clear1() {
        this.head = null;
    }

    public void clear() {
        while(this.head.next != null) {
            Node cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;
    }

    public Node reverseList() {
        Node prev = null;
        Node newHead = null;
        Node cur = this.head;

        while(cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next == null) {
            return slow;
        }
        return slow.next;
    }

    /*public Node FindKthToTail(int k) {
        if(k <= 0 || k > size()) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while(k-1 > 0) {
            fast = fast.next;
            k--;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }
*/
    public Node FindKthToTail(int k) {
        if(k <= 0) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while(k-1 > 0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println("该节点不存在！");
            }
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }

    public Node partition(int x) {
        Node cur = this.head;
        Node sa = null;
        Node ea = null;
        Node sb = null;
        Node eb = null;
        while(cur != null) {
            if(cur.data < x) {
                //判断是不是第一次插入
                if(sa == null) {
                    sa = cur;
                    ea = sa;
                    cur = cur.next;
                }else {
                    ea.next = cur;
                    ea = ea.next;
                    cur = cur.next;
                }
            }else {
                if(sb == null) {
                    sb = cur;
                    eb = sb;
                    cur = cur.next;
                }else {
                    eb.next = cur;
                    eb = eb.next;
                    cur = cur.next;
                }
            }
        }
        if (sa == null) {
            return sb;
        }
        ea.next = sb;
        if(sb != null) {
            eb.next = null;
        }
        return sa;
    }

    public Node deleteDuplication() {
        /*Node cur = this.head;
        Node newHead = new Node(-1);
        Node tmp = newHead;
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
        return newHead.next;*/


        Node cur = this.head;
        Node newhead = new Node(-1);
        Node tmp = newhead;
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
                if(cur != null) {
                    cur = cur.next;
                }

            }
        }
        return newhead.next;
    }

    public boolean chkPalindrome() {
        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }

        //找中间节点
        Node fast = this.head;
        Node slow = this.head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //反转单链表
        Node cur = slow.next;
        while(cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }

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

    public boolean func() {
        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }

        //找中点
        Node fast = this.head;
        Node slow = this.head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        //反转
        Node cur = slow.next;
        while(cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }

        while(slow != this.head) {

        }
    }

}
