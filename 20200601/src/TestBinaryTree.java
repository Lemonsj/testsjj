/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-06-01
 * Time: 22:25
 **/

class Node {
    public char value;
    public Node left;
    public Node right;

    public Node(char value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
public class TestBinaryTree {
    public Node createNode() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;

        return A;
    }

    void preOrderTraversal(Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    void inOrderTraversal(Node root) {
        if(root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }

    void postOrderTraversal(Node root) {
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

}
