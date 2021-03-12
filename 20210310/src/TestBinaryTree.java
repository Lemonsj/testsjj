import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-10
 * Time: 22:27
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
public  class TestBinaryTree {

    public Node createNode(){
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

    public  void preOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void inOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

    /*
    * 遍历思路-求结点个数
    * */
    int size = 0;
    void getSize1(Node root) {
        if(root == null) {
            return;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);

    }

    /*
    * 子思路问题-求结点个数
    * */
    int getSize2(Node root) {
        if(root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right)+1;
    }

    /*
    * 遍历思路-求叶子结点个数
    * */
    int leafSize = 0;
    void getLeafSize1(Node root) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }
    /*
    * 子思路问题-求叶子结点个数
    * */
    int getLeafSize2(Node root) {
        if(root == null) {
            return 0;
        }else if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }


    /*
    *子问题思路-求第 k 层结点个数
    * */
    int getLevelSize(Node root,int k) {
        if(root == null || k <= 0) {
            return -1;
        }
        if(k == 1) {
            return 1;
        }

        return getLevelSize(root.left,k-1) + getLevelSize(root.right,k-1);
    }

    /*
    * 查找 val 所在结点，没有找到返回 null
    * */
    Node find(Node root,int val) {
        if(root == null){
            return null;
        }
        if(root.value == val) {
            return root;
        }else {
            Node ret = find(root.left, val);
            if(ret != null)  return ret;
            ret = find(root.right, val);
            if(ret != null)  return ret;
        }
        return null;
    }









    public boolean isSameTree(Node p, Node q) {
        if(p == null && q == null){
            return true;
        }
        if((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if((p != null && q != null) && p.value != q.value) {
            return false;
        }
        boolean flag = isSameTree(p.left, q.left);
        if(!flag) return false;
        flag = isSameTree(p.right, q.right);
        if(!flag) return false;
        return true;
        //return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }


    public boolean isSubtree(Node s, Node t) {
        if(s == null || t == null) {
            return false;
        }

        boolean flag = isSameTree(s,t);
        if(flag)  return true;

        flag = isSubtree(s.left, t);
        if(flag)  return true;
        flag = isSubtree(s.right, t);
        if(flag)  return true;

        return false;
    }

    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHigh = maxDepth(root.left);
        int rightHigh = maxDepth(root.right);
        return (leftHigh > rightHigh) ? leftHigh + 1 : rightHigh + 1;
    }



    public boolean isBalanced(Node root) {
        if(root == null) {
            return true;
        }
        int leftHigh = maxDepth(root.left);
        int rightHigh = maxDepth(root.right);

        return (Math.abs(leftHigh - rightHigh) < 2 && isBalanced(root.left) && isBalanced(root.right));
    }




    public static boolean isSymmetricChild(Node p, Node q) {
        if((p == null && q != null) || (p != null && q == null)){
            return false;
        }
        if(p == null && q == null) {
            return true;
        }
        if(p.value != q.value) { return false; }
        return isSymmetricChild(p.left, q.right) && isSymmetricChild(p.right, q.left);

    }
    public static boolean isSymmetric(Node root) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return true;
        }
        return isSymmetricChild(root.left, root.right);

    }


    public List<List<Integer>> levelOrder(Node root) {
        if(root == null) {
            return null;
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(queue.size() > 0) {
            int size = queue.size();
            List<Integer> lt = new ArrayList<Integer>();
            while(size > 0) {
                Node tmp = queue.poll();
                size--;
                //lt.add(tmp.value);
                if(tmp != null) {
                    queue.offer(tmp.left);
                    queue.offer(tmp.right);
                }
            }
            list.add(lt);
        }
        return list;
    }


}
