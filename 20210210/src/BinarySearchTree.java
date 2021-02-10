/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-02-10
 * Time: 13:19
 **/
public class BinarySearchTree {
    static class Node{
        public int data;
        public Node left;
        public Node right;
        public Node(int data) {
            this.data = data;
        }
    }
    public Node root = null;
    public Node search(int val) {
        if(root == null) {
            return null;
        }
        Node cur = root;
        while(cur != null) {
            if(cur.data > val) {
                cur = cur.left;
            }else if(cur.data < val) {
                cur = cur.right;
            }else {
                break;
            }
        }
        if(cur != null) {
            return cur;
        }
        return null;
    }

    /*public boolean insert (int key) {
        Node node = new Node(key);
        if(root == null) {
            root = node;
            return true;
        }
        Node parent = null;
        Node cur = root;
        while(cur != null) {
            if(cur.data == key) {
                return false;
            }else if(cur.data < key) {
                parent = cur;
                cur = cur.right;
            }else{
                parent = cur;
                cur = cur.left;
            }
        }
        if(key > parent.data) {
            parent.right = node;
        }else {
            parent.left = node;
        }
        return true;
    }*/

    public boolean insert(int key) {
        Node node = new Node(key);
        if(root == null) {
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = null;
        while(cur != null) {
            if(root.data == key) {
                return false;
            }else if(root.data > key) {
                parent = cur;
                cur = cur.left;
            }else {
                parent = cur;
                cur = cur.right;
            }
        }
        if(key > parent.data) {
            parent.right = node;
        }else {
            parent.left = node;
        }
        return true;

    }

    public void remove(int key) {
        Node parent = null;
        Node cur = root;
        while(cur != null) {
            if(cur.data == key) {
                removeNode(parent,cur);
                return;
            }else if(cur.data  > key) {
                parent = cur;
                cur = cur.left;
            }else {
                parent = cur;
                cur = cur.right;
            }
        }
    }

    private void removeNode(Node parent, Node cur) {
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
             Node targetParent = cur;
             Node target = cur.right;

             while(target.left != null) {
                 targetParent = target;
                 target = target.left;
             }
             cur.data = target.data;
             if(target == targetParent.left) {
                 targetParent.left = target.right;
             }else {
                 targetParent.right = target.right;
             }
        }
    }
}
class test{
    public static void main(String[] args) {
        int[] array = {5,3,4,1,7,8,2,6,0,9};
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        for(int val : array) {
            binarySearchTree.insert(val);
        }
    }
}