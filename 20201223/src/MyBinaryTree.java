import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-23
 * Time: 11:18
 **/
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
public class MyBinaryTree {
    public Node crreateTree() {
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

    void prevOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        prevOrderTraversal(root.left);
        prevOrderTraversal(root.right);
    }
    void inOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }
    void postOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public int prevIndex = 0;
    public Node bulidTreeChild(char[] preorder,char[] inorder,int ib,int ie) {
        if(ib > ie) {
            return null;
        }
        Node root = new Node(preorder[prevIndex]);
        int rootIndex = findRootIndex(inorder,preorder[prevIndex],ib,ie);
        prevIndex++;
        if(rootIndex == -1) {
            return null;
        }
        root.left = bulidTreeChild(preorder,inorder,ib,rootIndex-1);
        root.right = bulidTreeChild(preorder,inorder,rootIndex+1,ie);
        return root;
    }

    private int findRootIndex(char[] inorder,char val,int ib,int ie) {
        for(int i = ib; i <= ie; i++) {
            if(inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }

    //根据一颗树的的前序遍历和中序遍历够开你二叉树
    public Node bulidTree(char[] preorder,char[] inorder) {
        if(preorder == null || inorder == null) {
            return null;
        }
        return bulidTreeChild(preorder,inorder,0,inorder.length-1);
    }


    public String tree2str(Node t) {
        StringBuffer sb = new StringBuffer();
        tree2strChild(t,sb);
        return sb.toString();
    }

    private String tree2strChild(Node t, StringBuffer sb)  {
        if(t == null) {
            return null;
        }
        sb.append(t.val);
        if(t.left == null) {
            if(t.right == null) {
                return null;
            }else {
                sb.append("()");
            }
        }else {
            sb.append("(");
            tree2strChild(t.left,sb);
            sb.append(")");
        }
        if(t.right == null) {
            return null;
        }else {
            sb.append("(");
            tree2strChild(t.right,sb);
            sb.append(")");
        }
        return null;
    }
    //使用栈进行非递归的前序遍历
    //栈：先进的后出
    public static void preOrderTraversalNor(Node root) {
        if(root == null) {
            return;
        }
        Node cur = root;
        Stack<Node> stack = new Stack<>();
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                System.out.println(cur.val + " ");
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }
    }
    public static void inOrderTraversalNor(Node root) {
        if(root == null) {
            return;
        }
        Node cur = root;
        Stack<Node> stack = new Stack<>();
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.println(top.val);
            top = top.right;
        }
    }
}
