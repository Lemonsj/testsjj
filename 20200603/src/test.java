/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-06-03
 * Time: 23:20
 **/
public class test {

    /*
    int getSize1(Node root) {
        if(root == null) {
            return 0;
        }
        return getSize1(root.left)+getSize1(root.right)+1;
    }

    int getLeafSize1(Node root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }else {
            return getLeafSize1(root.left)+getLeafSize1(root.right);
        }
    }

    //遍历思路
    static int leafSize = 0;
    void getLeafSize2(Node root) {
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null) {
            leafSize++;
            return;
        }else{
            getLeafSize2(root.left);
            getLeafSize2(root.right);
        }
    }
    //求第K层节点个数
    int getKLevelSize(Node root,int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1)+getKLevelSize(root.right,k-1);
    }
    int getHigh(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHigh = getHigh(root.left);
        int rightHigh = getHigh(root.right);

        return leftHigh>rightHigh ? leftHigh+1 : rightHigh+1;

    }
    */
    public static void main(String[] args) {

    }
}
