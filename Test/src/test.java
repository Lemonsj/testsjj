import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-13
 * Time: 23:12
 **/
public class test {
    public static void main(String[] args) {

    }
}

class TreeNode{
    int val;
    public TreeNode left = null;
    public TreeNode right = null;
    public TreeNode(){

    }
    public TreeNode(int val){
        this.val = val;
    }
    public String toString(){
        return val + "";
    }
}

class SolutionMethod1 {
    public void PrintFunction(TreeNode root) {
        if (root == null)
            return;

        List<TreeNode> list = new LinkedList<>();
        TreeNode node;
        int current = 1;                //当前层节点个数
        int next = 0;                    //记录的下一层节点个数
        list.add(root);                    //把根节点放入root中

        while (list.size() > 0) {
            node = list.remove(0);        //从list中取出根节点，并打印输出
            current--;
            System.out.printf("%-3d", node.val);

            if (node.left != null) {
                list.add(node.left);
                next++;
            }

            if (node.right != null) {
                list.add(node.right);
                next++;
            }
            /*
             *	当前层打印完毕，则将下一层的节点赋给current
             */
            if (current == 0) {
                System.out.println();
                current = next;
                next = 0;
            }
        }
    }
}