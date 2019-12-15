class MyLinkedList {
    static class Node {
        public int val;
        public Node next;
        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    Node head = null;
    Node rear = null;
    int usedsize;

    /*public int getlen() {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }*/

    public int get(int index) {
        if (index < 0 || index >= usedsize) {
            return -1;
        }
        Node cur = head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            rear = head;
            usedsize++;
        }else{
            node.next = head;
            head = node;
            usedsize++;
        }

    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            rear = head;
            usedsize++;
        }else{
            rear.next = node;
            rear = node;
            usedsize++;
        }

    }

    public void addAtIndex(int index, int val) {
        if (index == usedsize) {
            addAtTail(val);
            usedsize++;
            return;
        }

        if (index > usedsize) {
            return;
        }
        if (index < 0) {
            addAtHead(val);
            return;
        }
        Node node = new Node(val);
        Node cur = head;
        while (index-1 > 0) {
            cur = cur.next;
            index--;
        }
        node.next = cur.next;
        cur.next = node;
        usedsize++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= usedsize) {
            return;
        }
        if(index == 0){
            head = null;
            rear = head;
            usedsize--;
        }
        Node prev = head;
        while (0 < index-1) {
            index--;
            prev = prev.next;
        }
      /*  if(prev.next == null) {

        }*/
        //Node del = cur.next;
        prev.next = prev.next.next;
        usedsize--;
    }
}
