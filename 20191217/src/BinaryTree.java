import java.util.*;

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

    void inOrderTraversalNor(TreeNode root) {
        //List<Character> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null && !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            System.out.println(cur.value + " ");
            //list.add(cur.value);
            cur = cur.right;
        }
        //return list;
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
          return true;
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
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHight = maxDepth(root.left);
        int rightHight = maxDepth(root.right);

        return leftHight > rightHight
                ? leftHight + 1 : rightHight + 1;

    }

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return false;
        }
        int a = maxDepth(root.left);
        int b = maxDepth(root.right);
        if(Math.abs(a-b) <= 1) {
            isBalanced(root.left);
            int c = maxDepth(root.left.left);
            int d = maxDepth(root.left.right);
            if(Math.abs(c-d) <= 1) {
                isBalanced(root.right);
                int e = maxDepth(root.right.left);
                int f = maxDepth(root.right.right);
                if(Math.abs(e-f) <= 1) {
                    return true;
                }
            }

        }
        return false;
    }
    void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.value + " ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }
}
