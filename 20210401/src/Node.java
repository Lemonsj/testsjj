/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-04-01
 * Time: 18:17
 **/
public class Node {
    int key;
    /*
    * bf表示平衡因子
    * */
    int bf;
    Node parent;
    Node left;
    Node right;

    public Node (int key,Node parent) {
        this.key = key;
        this.bf = bf;
        this.left = null;
        this.right = null;
        this.parent = parent;
    }
}
