import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-15
 * Time: 16:52
 **/
public class Test {

    //求水仙花数
    public static void main1(String[] args) {
        for(int i = 1; i< 999_999; i++) {
            int count = 0;
            int tmp = i;
            double sum = 0;
            while(tmp != 0) {
                count++;
                tmp /= 10;
            }
            tmp = i;
            //123
            while(tmp!= 0) {
                sum += Math.pow(tmp%10,count);//3,count
                tmp /= 10;
            }
            if(sum == i) {
                System.out.println("水仙花数为"+i);
            }
        }
    }

    //求一个数二进制的奇数位和偶数位
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            for(int i = 31; i >= 1; i -= 2) {
                System.out.print(((n>>i)&1) + " ");
            }
            System.out.println();
            for(int i = 30; i >= 0; i -= 2) {
                System.out.print(((n>>i)&1) + " ");
            }
        }
    }

    //输出一个数字的每一位
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            fcn(n);
        }
    }

    private static void fcn(int n) {
        if(n > 9) {
            fcn(n/10);
        }
        System.out.println(n%10);
    }

    public static int sum(int n) {
        if(n >1) {
            return n+sum(n-1);
        }else {
            return 1;
        }
    }

    public static void main4(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    public static int func(int n) {
        if(n > 9) {
            return n%10+func(n/10);
        }else {
            return n;
        }
    }

    public static void main5(String[] args) {
        int n = 1729;
        System.out.println(func(n));
    }

    public static void main6(String[] args) {
        String str = "hello";
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myToString(array));
    }
    public static String myToString(int[] array) {
        String ret = "[";
        for(int i = 0; i < array.length; i++) {
            ret += array[i];
            if(i != array.length-1) {
                ret += ",";
            }

        }
        ret += "]";
        return ret;
    }


}
