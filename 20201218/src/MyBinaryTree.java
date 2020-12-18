//import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-18
 * Time: 20:25
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

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {

    }
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
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

    public int getKLevelSize(Node root,int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }else {
            return getKLevelSize(root.left, k-1)  + getKLevelSize(root.right, k-1);
        }
    }

    public Node find(Node root,int val) {
        if(root == null) {
             return null;
        }
        if(root.val == val) {
            return root;
        }
        Node ret = find(root.left,val);
        if(ret != null) {
            return ret;
        }
        ret = find(root.right,val);
        if(ret != null) {
            return ret;
        }
        return null;
    }



    //二叉树的前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }


    List<Integer> ret = new ArrayList<>();
    public void preorderTraversalChild(TreeNode root) {
        if(root == null) {
            return;
        }
        ret.add(root.val);
        preorderTraversalChild(root.left);
        preorderTraversalChild(root.right);
    }
    public List<Integer> preorderTraversal1(TreeNode root) {
        preorderTraversal(root);
        return ret;
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null && q != null) || (q == null && p != null)) {
            return false;
        }
        if(p == null && q == null) {
            return true;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null || t == null) {
            return false;
        }
        if(isSameTree(s,t)) {
            return true;
        }
        if(isSubtree(s.left,t)) {
            return true;
        }
        if(isSubtree(s.right,t)) {
            return true;
        }
        return false;
    }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHigh = maxDepth(root.left);
        int rightHigh = maxDepth(root.right);
        return leftHigh > rightHigh ? leftHigh+1 : rightHigh+1;
    }

}
