/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-13
 * Time: 16:04
 **/
public class TestDemo {
    public static void main(String[] args) {
        TestBinaryTree testBinaryTree = new TestBinaryTree();
        Node root = testBinaryTree.creatBinaryTree();
        testBinaryTree.preOrderTraversal(root);
        int ret = testBinaryTree.getKLevelSize(root,4);
        System.out.println(ret);
    }
}
