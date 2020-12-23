/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-23
 * Time: 11:22
 **/
public class Test {
    public static void main1(String[] args) {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        Node root = myBinaryTree.crreateTree();
        myBinaryTree.prevOrderTraversal(root);
        System.out.println();
        myBinaryTree.inOrderTraversal(root);
        System.out.println();
        myBinaryTree.postOrderTraversal(root);
        System.out.println();
    }

    public static void main(String[] args) {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        char[] prevorder = {'A','B','D','E','H','C','F','G'};
        char[] inorder = {'D','B','E','H','A','F','C','G'};
        Node root = myBinaryTree.bulidTree(prevorder,inorder);
        myBinaryTree.postOrderTraversal(root);
        System.out.println();
    }
}
