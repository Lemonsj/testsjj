/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-06
 * Time: 23:46
 **/
public class Test {
    public static void main(String[] args) {
        int[] array = { 6, -3, -2, 7, -15, 1, 2, 2 };
        int num = FindGreatestSumOfSubArray(array);
        System.out.println(num);
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        //判断数组是否为空
        if(array.length==0){
            return 0;
        }
        //记录最大子数组和
        int max=array[0];
        //记录和
        int sum=0;
        int len=array.length;
        if(len<=0){
            return 0;
        }
        for(int i=0;i<len;i++){
            //如果之前所加之和为0或负值，则直接清零
            if(sum<=0){
                sum=array[i];
            }else{
                //如果之前所见之和为正，则继续加
                sum+=array[i];
            }
            //记录最大的子数组和
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }


    public int FindGreatestSumOfSubArray1(int[] array) {
        //max就是上面的dp[i]
        int max = array[0];
        //因为这个dp[i]老是变，所以比如你dp[4]是8 dp[5]就变成-7了，所以需要res保存一下
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            res = Math.max(res, max);
        }
        return res;
    }
}
