import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-04-12
 * Time: 15:36
 **/
public class Test {
    //n = 0  -- 0
    //n = 1  -- 1
    //n = 2  -- 2
    public static int fab(int n) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 0;
        while(n >= 3) {
            d = a+b+c;
            a = b;
            b = c;
            c = d;
            n--;
        }
        return d;
    }

    //3->3  4->6  5->11
    public static void main1(String[] args) {
        int ret = fab(5);
        System.out.println(ret);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        if(nums == null || nums.length < 0) {
            return null;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(target - nums[i])){
                ret = new int[]{nums[i],target - nums[i]};
            }else {
                set.add(nums[i]);
            }
        }
        return ret;
    }

    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        if(array.length == 0 || array == null) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int[] ret = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        int tmp = Integer.MAX_VALUE;
        boolean flag = false;
        for(int i = 0; i < array.length; i++) {
            if(set.contains(sum - array[i])) {
                flag = true;
                if(array[i] * (sum - array[i]) < tmp) {
                    ret[0] = array[i];
                    ret[1] = sum - array[i];
                    tmp = ret[0] * ret[1];
                }
            }
        }
        list.add(ret[0]);
        list.add(ret[1]);
        return list;
    }

    public String LCS (String str1, String str2) {
        // write code here
        String ret = "";
        if(str1 == null || str2 == null) {
            return null;
        }
        for(int i = 0; i < str1.length(); i++) {
            for(int j = i+1; j < str1.length(); j++) {
                if(str2.contains(str1.substring(i,j)) && (str1.substring(i,j)).length() > ret.length()) {
                    ret = str1.substring(i,j);
                }
            }
        }
        return ret;
    }

    public static int Fibonacci1(int n) {
        int[] f = new int[n];
        f[0] = 0;
        f[1] = f[2] = 1;
        for(int i = 3; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        int ret = f[n];
        //delect[] f;  C++写法，释放空间
        return ret;
    }

    public static void main3(String[] args) {
        int ret = Fibonacci1(0);
        System.out.println(ret);
    }

    public int Fibonacci(int n){
        if(n <= 0) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        int fn1 = 1,fn2 = 1;
        int fn = 0;
        for(int i = 3; i <= n; i++) {
            fn = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn;
        }
        return fn;
    }

    public static int numWays(int n) {
        if(n == 0) {
            return 1;
        }
        int[] f = new int[n+1];
        f[0] = 1;
        f[1] = 1;
        //f[2] = 2;
        for(int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
            f[i] %= Integer.MIN_VALUE;
        }
        return f[n];
    }

    public static void main(String[] args) {
        int ret = numWays(44);
        System.out.println(ret);
    }
}
