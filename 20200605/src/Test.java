/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-06-05
 * Time: 23:49
 **/

class TreeNode {
    public char value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
public class Test {

    public boolean IsBalance_Solution(TreeNode root){

        if(root==null) return true;

        int left = depth(root.left);

        int right = depth(root.right);

        if(Math.abs(left-right)>1){

            return false;

        }

        // return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);

        return true;

    }





    public boolean IsBalanced_Solution(TreeNode root) {



        if(root==null) return true;



        if(Math.abs(getHeight(root.left)-getHeight(root.right))>1) return false;



        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);

    }



    public int getHeight(TreeNode root){



        if(root==null) return 0;

        return max(getHeight(root.left),getHeight(root.right))+1;

    }



    private int max(int a, int b){



        return (a>b)?a:b;

    }



    public boolean IsBalanced_Solution3(TreeNode root){

        return etDepth(root) !=-1;

    }

    private int etDepth(TreeNode root){

        if(root == null) return 0;

        int left = etDepth(root.left);

        if(left == -1) return -1;

        int right = etDepth(root.right);

        if(right == -1) return -1;

        return Math.abs(left-right) >1 ? -1:1+Math.max(left, right);

    }


    public int depth(TreeNode root){

        if(root==null){

            return 0;

        }

        int left = depth(root.left);

        int right = depth(root.right);

        return left>right?(left+1):(right+1);

    }


    public static void main(String[] args) {

    }
}
