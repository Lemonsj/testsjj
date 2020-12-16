/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-16
 * Time: 19:38
 **/
public class Test {
    public static void main(String[] args) {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        Node root = myBinaryTree.creatBinaryTree();
        myBinaryTree.preOrderTraversal(root);
        myBinaryTree.getLeafSize1(root);

    }
}
