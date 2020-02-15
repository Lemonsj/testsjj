import java.util.Stack;

class TreeNode {
    char value;
    TreeNode left;
    TreeNode right;
    public TreeNode(char value) {
        this.value = value;
    }
}
public class BinaryTree {
    public BinaryTree() {

    }
    public TreeNode buildTree() {
        TreeNode root = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');
        root.left = B;
        root.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return root;
    }

    //前序遍历
    void preOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.println(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    void preOrderTraversalNor(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                System.out.println(cur.value + " ");
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
    }

    //中序遍历
    void inOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.println(root.value + " ");
        inOrderTraversal(root.right);
    }

    //后序遍历
    void postOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.println(root.value + " ");
    }











}
