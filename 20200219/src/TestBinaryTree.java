public class TestBinaryTree {

    static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node root = null;

    public Boolean insert(int key) {
        Node node = new Node(key);
        Node cur = root;
        Node parent = null;
        if(root == null) {
            root = node;
            return true;
        }
        while(cur != null) {
            if(cur.data == key) {
                return false;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
                //parent.left = node;
            }
        }
        if(key < parent.data) {
            parent.left = node;
        }else {
            parent.right = node;
        }
        return true;
    }

    //查找   key
    public Node search(int key) {
        Node cur = root;
        while(cur != null) {
            if(cur.data < key) {
                cur = cur.right;
            }else if(cur.data > key) {
                cur = cur.left;
            }else {
                return cur;
            }
        }
        return null;
    }
    //中序遍历
    public void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //删除关键字为key的节点
    public void remove(int key) {
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if(cur.data == key) {
                //找到了要删除的节点
                removeNode(parent,cur);
                return;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
    }
    public void removeNode(Node parent,Node cur){
        if(cur.left == null) {
            if(cur == root) {
                root = cur.right;

            }else if(cur == parent.left) {
                parent.left = cur.right;

            }else {
                parent.right = cur.right;

            }
        }else if(cur.right == null) {
            if(cur == root) {
                root = cur.left;
            }else if(cur == parent.left) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }

        }else {

        }

    }




}

