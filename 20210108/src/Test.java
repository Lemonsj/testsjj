/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-08
 * Time: 23:14
 **/
public class Test {
    public static void main(String[] args) {

    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0) {
            return 0;
        }
        //记录最大子数组之和
        int max = array[0];
        //记录和
        int sum = 0;
        int len = array.length;
        while(len <= 0) {
            return 0;
        }
        for(int i = 0; i < len; i++) {
            if(sum <= 0) {
                sum = array[i];
            }else {
                sum += array[i];
            }
            if(sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public int GetUglyNumber_Solution(int index) {
        if (index < 1) {
            // 参数非法
            return 0;
        }

        int res = 0;

        for (int idx=1; idx <= index;) {
            if (isUglyNumber(++res)) {
                idx++;
            }
        }

        return res;
    }

    private boolean isUglyNumber(int num) {
        if (num < 1) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        return num == 1;
    }
}
