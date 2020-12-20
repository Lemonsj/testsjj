/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-20
 * Time: 16:39
 **/
import java.util.*;
class Node{
    public char val;
    public Node left;
    public Node right;
    public Node(char val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class Main{
    public static int i = 0;
    public static Node createTree(String str) {
        Node node = null;
        if(str.charAt(i) != '#') {
            node = new Node(str.charAt(i));
            i++;
            node.left = createTree(str);
            node.right = createTree(str);
        }else {
            i++;
        }
        return node;
    }
    public static void inorderTraversal(Node root) {
        if(root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            Node root = createTree(str);
            inorderTraversal(root);
        }
    }
}
