class TreeNode {
    char value;
    TreeNode left;
    TreeNode right;
    public TreeNode(char value) {
        this.value = value;
    }
}
class BinaryTree {
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

    // 前序遍历
    void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // 中序遍历
    void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }
    // 后序遍历
    void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }
    int getLeafSize2 (TreeNode root){
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }
    int getKLevelSize(TreeNode root,int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        return getKLevelSize(root.left, k-1) +getKLevelSize(root.right, k-1);
    }
    //前序遍历的形式查找
    TreeNode find(TreeNode root, char val) {
        if(root == null) {
            return null;
        }
        if(root.value == val) {
            return root;
        }
        TreeNode ret = find(root.left,val);
        if(ret != null) {
            return ret;
        }
        ret = find(root.right,val);
        if(ret != null) {
            return ret;
        }
        return null;
    }
    public boolean isSameTree(TreeNode p,TreeNode q) {

    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(isSameTree(s,t)) {
            return true;
        }
        boolean ret = isSameTree(s.left,t);
        if(ret) {
            return true;
        }
        ret = isSameTree(s.right,t);
        if(ret) {
            return true;
        }
        return false;
    }
}
