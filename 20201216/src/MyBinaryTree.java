import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-16
 * Time: 19:31
 **/
class Node{
    public char val;
    public Node left;
    public Node right;
    public Node(char val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class MyBinaryTree {
    public Node creatBinaryTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }

    void preOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        System.out.println(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    void inOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root);
        inOrderTraversal(root.right);
    }
    void postOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root);
    }

    static int size = 0;
    public int getSize1(Node root) {
        if(root == null) {
            return 0;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
        return size;

    }
    public int getSize2(Node root) {
        if(root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right) + 1;
    }

    public int getLeafSize2(Node root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }else {
            return getLeafSize2(root.left) + getLeafSize2(root.right);
        }
    }

    static int leafSize = 0;
    public void getLeafSize1(Node root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            leafSize++;
            return;
        }else {
            getLeafSize2(root.left);
            getLeafSize2(root.right);
        }
    }

    public int getLevelSize(Node root,int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }else {
            return getLevelSize(root.left,k-1) + getLevelSize(root.right,k-1);
        }
    }

    /*public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }*/
}
