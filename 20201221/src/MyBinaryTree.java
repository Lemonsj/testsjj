import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-21
 * Time: 19:27
 **/
class Node{
    public int val;
    public Node left;
    public Node right;
    public Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class MyBinaryTree {
    public static void levelOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.println(cur.val);
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }

    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if(root == null) {
            return ret;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            while(size > 0) {
                Node cur = queue.poll();
                size--;
                list.add(cur.val);
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

    public Node lowestCommonAncestor(Node root,Node p,Node q) {
        if(root == null) {
            return null;
        }
        if(root== p || root == q) {
            return root;
        }
        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null) {
            return root;
        }
        if(left != null) {
            return root.left;
        }
        if(right != null) {
            return root.right;
        }
        return null;
    }

    public TreeNode prev = null;
    public void ConvertChild(TreeNode pCur) {
        if(pCur == null) {
            return;
        }
        ConvertChild(pCur.left);
        pCur.left = prev;
        if(prev != null) {
            prev.right = pCur;
        }
        prev = pCur;
        ConvertChild(pCur.right);
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertChild(pRootOfTree);
        TreeNode head = pRootOfTree;
        while(head != null && head.left != null) {
            head = head.left;
        }
        return head;
    }

    public boolean isCompleteTree(Node root) {
        if(root == null) {
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            if(cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else {
                break;
            }
        }

        while(!queue.isEmpty()) {
            Node cur = queue.peek();
            if(cur != null) {
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }
}
