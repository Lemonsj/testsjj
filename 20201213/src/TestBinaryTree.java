/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-13
 * Time: 15:58
 **/
class Node{
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
    public Node creatBinaryTree() {
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

    public void preOrderTraversal(Node root) {

        if(root == null) {
            return;
        }
        System.out.println(root.value);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraaversal(Node root) {
        if(root == null) {
            return;
        }
        inOrderTraaversal(root.left);
        System.out.println(root.value);
        inOrderTraaversal(root.right);
    }
    public void postOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.value);
    }

    public int getSize1(Node root) {
        if(root == null) {
            return 0;
        }
        return getSize1(root.left) + getSize1(root.right) + 1;
    }
    static int size = 0;
    public int getSize2(Node root) {
        if(root == null) {
            return 0;
        }
        size++;
        getSize2(root.left);
        getSize2(root.right);
        return size;
    }

    public int getLeafSize2(Node root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }else {
            return getLeafSize2(root.left) + getLeafSize2(root.right);
        }
    }

    static int leafSize = 0;
    void getLeafSize1(Node root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            leafSize++;
            return;
        }else {
            getLeafSize1(root.left);
            getLeafSize1(root.right);
        }
    }

    public int getKLevelSize(Node root,int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);
    }

}
