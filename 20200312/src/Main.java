import java.util.*;
class TreeNode{
    char val;
    TreeNode left;
    TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }
}

public class Main {
    public static int i = 0;
    public static TreeNode buildTree(String str) {
        TreeNode root = null;
        if(str.charAt(i) != '#') {
            root = new TreeNode(str.charAt(i));
            i++;
            root.left = buildTree(str);
            root.right = buildTree(str);
        }else {
            i++;
        }
        return root;
    }

    public static void inorder(TreeNode root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        TreeNode root = buildTree(str);
        inorder(root);
    }

}