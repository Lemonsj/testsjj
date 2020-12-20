import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-20
 * Time: 16:02
 **/
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public static boolean isSymmetricChild(TreeNode left,TreeNode right) {
        if((left == null && right != null) || (left != null && right == null)) {
            return false;
        }
        if(left == null && right == null) {
            return true;
        }
        if(left.val != right.val) {
            return false;
        }
        return isSymmetricChild(left.left,right.right) && isSymmetricChild(left.right,right.left);
    }
    public static boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }


    public void levelOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            if(cur!= null) {
                System.out.println(cur.val);
                if(cur.left != null) {
                    queue.offer(cur.left);
                }
                if(cur.right != null) {
                    queue.offer(cur.right);
                }
            }
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            while(size > 0) {
                TreeNode cur = queue.poll();
                size--;
                if(cur != null) {
                    list.add(cur.val);
                    if(cur.left != null) {
                        queue.offer(cur.left);
                    }
                    if(cur.right != null) {
                        queue.offer(cur.right);
                    }
                }
            }
            ret.add(list);
        }
        return ret;
    }
}
