/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-18
 * Time: 20:29
 **/
public class Test {
    public static void main(String[] args) {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        Node root = myBinaryTree.creatBinaryTree();
        /*int ret = myBinaryTree.getKLevelSize(root,3);
        System.out.println(ret);*/
        Node ret = myBinaryTree.find(root,'E');
        System.out.println(ret);

    }
}
