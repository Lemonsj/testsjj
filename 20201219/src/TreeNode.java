/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-18
 * Time: 22:07
 **/
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



    //求二叉树的最大深度

    /*public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHigh = maxDepth(root.left);
        int rightHigh = maxDepth(root.right);
        return leftHigh>rightHigh ? leftHigh+1 : rightHigh+1;
    }

    //判断一棵树是不是平衡二叉树
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.abs(left - right) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }*/


    //判断一棵树是不是平衡二叉树


    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHigh = maxDepth(root.left);
        int rightHigh = maxDepth(root.right);
        return leftHigh > rightHigh ? leftHigh+1 : rightHigh+1;
    }
    public static boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int leftHigh = maxDepth(root.left);
        int rightHigh = maxDepth(root.right);
        return Math.abs(leftHigh - rightHigh) < 2 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static boolean isSameTree(TreeNode p,TreeNode q) {
        if((p == null && q != null) || (q == null && p != null)) {
            return false;
        }
        if(p == null && q == null) {
            return true;
        }
        if(q.val != p.val) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public static boolean isSubtree(TreeNode s,TreeNode t) {
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
    public static boolean isSymmetric(TreeNode root) {

    }

}
