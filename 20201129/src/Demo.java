import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-29
 * Time: 15:25
 **/
public class Demo {
    public static int count = 0;
    public static int[] array;
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            array = new int[n+1];

            for(int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            count(40,n);
            System.out.println(count);
        }
    }

    public static void count(int s,int n) {
        if(s == 0) {
            count++;
        }
        if(s < 0 || (s > 0 && n < 0)) {
            return;
        }
        count(s - array[n],n-1);
        count(s,n-1);
    }

    public static void main2(String[] args) {
        String s;
        //System.out.println("s=" +s);
    }


    public static void main3(String[] args) {
        int x,y;
        x = 5>>2;
        y = x>>>2;
        System.out.println(y);
    }

    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");

        operate(a,b);
        System.out.println(a+"."+b);
    }

    private static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}
