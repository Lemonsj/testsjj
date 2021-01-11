import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-11
 * Time: 22:51
 **/

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Test {
    public void Mirror(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)){
            return;
        }
        TreeNode tem=root.left;
        root.left=root.right;
        root.right=tem;
        if (root.left != null)
            Mirror(root.left);
        if (root.right != null)
            Mirror(root.right);
    }


    public void mirror(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }

        // 交换左右子树
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        // 处理root.left及root.right
        mirror(root.left);
        mirror(root.right);
    }

    /**
     * 思路：
     * 1、非递归处理
     * 2、层次遍历，每次处理当前元素，交换当前元素的左右子树即可
     */
    public void mirrorII(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();

            if (cur.left != null || cur.right != null) {
                // 交换左右子树
                TreeNode tmp = cur.left;
                // 此处必须赋值给cur.left/right，更新节点指向，不能使用临时变量
                cur.left = cur.right;
                cur.right = tmp;
            }

            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;

        //new Mirror().mirror(root);

        System.out.println(root.left.val);
    }


}
