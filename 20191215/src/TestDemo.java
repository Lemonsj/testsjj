import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();


    }
    /*public static void main(String[] args) {
        int getLeafSize2(TreeNode root) {
            if(root == null) {
                return 0;
            }else if(root.left == null && root.right == null) {
                return 1;
            }
            return getLeafSize2(root.left) +getLeafSize2(root.right);
        }
    }*/
    public static void main2(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(3);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.deleteAtIndex(0);
    }
    /*public static void main1(String[] args) {
        //中序遍历
        void inOrderTraversal(TreeNode root) {
            *//*
            if(root == null) {
                return;
            }
            if(root.left == null) {
                System.out.println(root);
            }
            inOrderTraversal(root.left);
            if(root.right == null) {
                System.out.println(root);
            }*//*
            inOrderTraversal(root.left);
            System.out.println(root.value);
            inOrderTraversal(root.right);
        }

        //后序遍历
        void postOrderTraversal(TreeNode root) {
            if(root == null) {

            }
        }
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if(root == null) {
                return list;
            }
            List<Integer> list1 = inorderTraversal(root.left);
            list.addAll(list1);
            System.out.println(root.value);
            list.add(root.val);
            List<Integer> list2 = inorderTraversal(root.right);
            list.addAll(list2);
            return list;
        }
    }
    A B D E H C F G
    D B E H A F C G
    D H E B F G C A
*/
}
