/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-06-07
 * Time: 21:19
 **/
class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}


public class test {

    //根据前序遍历和中序遍历构建一颗二叉树

    public int preIndex = 0;
    
    public TreeNode bulidTreeChild(int[] preorder,int[] inorder,int inbegin,int inend) {

        if(inbegin > inend) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIndex]);
        
        
        //查找根节点在中序遍历中的下标
        int rootIndex = findRootIndexOnInorder(inorder,preorder[preIndex],inbegin,inend);
        preIndex++;

        if(rootIndex == -1) {
            return null;
        }

        root.left = bulidTreeChild(preorder,inorder,inbegin,rootIndex-1);
        root.right = bulidTreeChild(preorder,inorder,rootIndex+1,inend);

        return root;
    }

    private int findRootIndexOnInorder(int[] inorder, int val, int inbegin, int inend) {
        for (int i = inbegin; i <=inend ; i++) {
            if(inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode bulidTree(int[] perorder,int[] inorder) {
        if(perorder == null || inorder == null) {
            return null;
        }
        return bulidTreeChild(perorder,inorder,0,inorder.length-1);
    }


    /*************8888888888888888888*/



}
