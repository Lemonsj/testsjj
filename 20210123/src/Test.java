import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-23
 * Time: 18:45
 **/
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Test {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int num[]=new int[N];
        int A1=0,A2=0,A3=0,A4=0,A5=0,flag=1,count=0;
        for(int i=0;i<N;i++){
            num[i]=in.nextInt();
            if(num[i]%5==0){
                if(num[i]%2==0)
                    A1+=num[i];
            }
            if(num[i]%5==1){
                A2+=flag*num[i];
                flag=-flag;
            }
            if(num[i]%5==2){
                A3++;
            }
            if(num[i]%5==3){
                A4+=num[i];
                count++;
            }
            if(num[i]%5==4){
                if(num[i]>A5)
                    A5=num[i];
            }
        }
        if(A1!=0){
            System.out.print(A1+" ");
        } else{
            System.out.print('N'+" ");
        }
        if(A2!=0){
            System.out.print(A2+" ");
        } else{
            System.out.print('N'+" ");
        }
        if(A3!=0){
            System.out.print(A3+" ");
        } else{
            System.out.print('N'+" ");
        }
        if(A4!=0){
            System.out.print(A4/count+"."+(int)((A4%count*100/count+5)/10)+" ");
        } else{
            System.out.print("N"+" ");
        }
        if(A5!=0){
            System.out.print(A5);
        } else{
            System.out.print("N");
        }
    }

    public int getHigh(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHigh = getHigh(root.left);
        int rightHigh = getHigh(root.right);
        return leftHigh > rightHigh ? leftHigh + 1 : rightHigh + 1;
    }
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null) {
            return true;
        }
        int left = getHigh(root.left);
        int right = getHigh(root.right);
        return Math.abs(left - right) < 2  && isBalance(root.left) && isBalance(root.right);
    }
}
