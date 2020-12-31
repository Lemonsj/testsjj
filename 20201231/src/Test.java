/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-31
 * Time: 23:33
 **/
public class Test {
    public static int search(int[] A, int target) {
        // write code here
        int left=0,right=A.length-1;
        while(left<=right){
            int mid=left+(right-left)/2; //防止相加溢出的写法
            if(A[mid]==target)
                return mid;
                //左边有序
            else if(A[left]<=A[mid]){
                //在左边有序范围内
                if(target>=A[left]&&target<=A[mid])
                    right=mid-1;
                    //不在有序范围内，只能去右边找
                else
                    left=mid+1;
            }
            //右边有序
            else{
                //在右边有序范围内
                if(target>=A[mid]&&target<=A[right])
                    left=mid+1;
                    //不在有序范围内，只能去左边找
                else
                    right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {4,5,6,7,8,1,2,3};
        int ret = search(array,8);
        System.out.println(ret);
    }

    public static String getMaxNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(compareTo(arr[i], arr[j])) {
                    //a+b >=b+a 则不需要交换
                }else {
                    //否则进行交换
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String res="";
        //把数字全部拼接起来
        for (int i = 0; i < arr.length; i++) {
            res += Integer.toString(arr[i]);
        }
        return res;

    }
    //如果a+b>=b+a 则返回true，否则返回false
    public static boolean compareTo(int a,int b) {
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        int cmp1 = Integer.parseInt(strA+strB);
        int cmp2 = Integer.parseInt(strB+strA);
        if(cmp1>=cmp2) {
            return true;
        }else {
            return false;
        }
    }


}
