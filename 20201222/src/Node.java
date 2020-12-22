import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-22
 * Time: 11:29
 **/
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node(int val) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();
            if(cur != null) {
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

    public List<List<Integer>> leveOrderTraversal(Node root) {
        if(root == null) {
            return null;
        }
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            while(size > 0) {
                Node cur = queue.poll();
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

    public static boolean isCompleteTree(Node root) {
        if(root == null) {
            return false;
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
        Node cur = queue.poll();
        while(!queue.isEmpty()) {
            if(cur != null) {
                return false;
            }else {
                cur = queue.poll();
            }
        }
        return true;
    }

    public Node lowestCommonAncestor(Node root,Node p,Node q) {
        if(root == null) {
            return null;
        }
        if(root == p || root == q) {
            return root;
        }
        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null) {
            return root;
        }
        if(left != null) {
            return left;
        }
        if(right != null) {
            return right;
        }
        return null;
    }

    public static Node prev = null;
    public static void ConvertChild(Node pCur) {
        if(pCur == null) {
            return;
        }
        //在中序遍历的过程中就改变指向
        ConvertChild(pCur.left);

        pCur.left = prev;
        if(prev != null) {
            pCur.right = prev;
        }
        prev = pCur;

        ConvertChild(pCur.right);

    }
    public static Node Convert(Node root) {
        ConvertChild(root);
        Node head = root;
        while(head != null && head.left != null) {
            head = head.left;
        }
        return head;
    }

}
