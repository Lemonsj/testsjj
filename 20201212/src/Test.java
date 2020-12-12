import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-12
 * Time: 21:23
 **/
public class Test {
    public static void main1(String[] args) {
        int Fp = 10*30;
        int Mp = 0;
        for(int i = 0; i < 30; i++) {
            Mp += (int)Math.pow(2,i);
        }
        System.out.println(Fp + "分");
        System.out.println(Mp + "万元");
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            int n = scan.nextInt();
            int len = str.length();
            int[] count = new int[len-n];
            int max = 0;
            for(int i = 0; i < len-n; i++) {
                String ptr = str.substring(i,i+n);
                for(int j = 0; j < n; j++) {
                    if(ptr.charAt(j) == 'C' || ptr.charAt(j) == 'G') {
                        count[i]++;
                    }
                }
                if(count[max] < count[i]) {
                    max = i;
                }
            }
            System.out.println(str.substring(max,max+n));
        }
    }

    public static void main(String[] args) {
        Integer s1 = 59;
        int s2 = 59;

        Integer s3 = Integer.valueOf(59);
        Integer s4 = new Integer(59);
        System.out.println(s3 == s4);
    }
}
class HS {
    private static int x = 100;

    public static void main3(String[] args) {
        HS hs1 = new HS();
        hs1.x++;
        HS hs2 = new HS();
        hs2.x++;
        hs1 = new HS();
        hs1.x++;
        HS.x--;
        System.out.println("x=" + x);
    }
}

class func{
    public static void main4(String[] args) {
        try{
            Class c = Class.forName(args[0]);
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i].toString());
            }
        }catch(Throwable e) {
            System.out.println(e);
        }
    }
}
