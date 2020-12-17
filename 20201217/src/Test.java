import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-17
 * Time: 22:22
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
    public static void main1(String[] args) {

    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode nowNode = q.peek();
            q.poll();
            resultList.add(nowNode.val);
            if (nowNode.left != null) {
                q.add(nowNode.left);
            }
            if (nowNode.right != null) {
                q.add(nowNode.right);
            }
        }

        return resultList;
    }


    public static void main ( String[] args ) {
        Scanner in = new Scanner( System.in );
        String s = in.nextLine();
        for( int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        in.close();
    }

}
