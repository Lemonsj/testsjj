import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-28
 * Time: 20:05
 **/
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class Test {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(root == null) {
            return list;
        }
        /*
        tmp.add(root.val);
        list.add(tmp);
        */
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size = 0;
        while(!queue.isEmpty()) {
            ArrayList<Integer> tmp = new ArrayList<>();
            size = queue.size();
            while(size > 0 && !queue.isEmpty()) {
                TreeNode cur = queue.poll();
                size--;
                if(cur != null) {
                    tmp.add(cur.val);
                    if(cur.left != null) {
                        queue.add(cur.left);
                    }
                    if(cur.right != null) {
                        queue.add(cur.right);
                    }
                }
            }
            list.add(tmp);
        }
        return list;
    }


    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        if(root == null){
            return -1;
        }
        if(o1 == root.val || o2 == root.val) {
            return root.val;
        }
        int left = lowestCommonAncestor(root.left,o1,o2);
        int right = lowestCommonAncestor(root.right,o1,o2);
        if(left != -1 && right != -1) {
            return root.val;
        }
        if(left != -1) {
            return left;
        }
        if(right != -1) {
            return right;
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
