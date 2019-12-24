import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        B.right = H;
        E.right = H;
        C.left = F;
        C.right = G;
        return root;
    }
    //递归：循环调用自己本身，并且有终止条件
    void preOrderTraversal(TreeNode root){
        if(root == null) {
            return;
        }
        System.out.println(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public List<Integer> preOrderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return null;
        }
        System.out.println(root.value + " ");
        //list.add(root.value + " ");
        List<Integer> list1 = preOrderTraversal2(root.left);
        list.addAll(list1);
        List<Integer> list2 = preOrderTraversal2(root.right);
        list.addAll(list2);
        return list;
    }

    void inOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        preOrderTraversal(root.left);
        System.out.println(root.value + " ");
        preOrderTraversal(root.right);
    }

    void postOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        System.out.println(root.value + " ");
    }


    int getSize1(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return getSize1(root.left) + getSize1(root.right) +1;
    }
    static int size = 0;
    int getSize2(TreeNode root) {
        if(root == null) {
            return -1;
        }
        size++;
        getSize2(root.left);
        getSize2(root.right);
        return size;
    }

    int getLeafSize(TreeNode root) {
        if(root == null) {
            return -1;
        }else if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize(root.left) + getLeafSize(root.right);
    }

    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if(cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else {
                break;
            }
        }

        while (!queue.isEmpty()) {
            TreeNode cur = queue.peek();
            if(cur != null) {
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }


    void levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.println(cur.value + " ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();//4
            List<Integer> list = new ArrayList<>();
            while (size > 0) {
                TreeNode cur = queue.poll();
                System.out.print(cur.value+" ");
                //list.add(cur.value);
                size--;//0
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            ret.add(list);
        }
        return ret;
    }
    public int i = 0;
    TreeNode buildTree2(String str) {
        TreeNode root = null;
        if(str.charAt(i) != '#') {
            root = new TreeNode(str.charAt(i));
            i++;
            root.left = buildTree2(str);
            root.right = buildTree2(str);
        }else {
            i++;
        }
        return root;
    }

}

