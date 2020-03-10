
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

class person {
    String name;
    int age =10;
    public person(int age) {
        //this();
        this.age = age;
    }
    public person(int age,int n) {
        //int age = 10;
        this(age);
        System.out.println("无参");
    }


}
public class Test {
    /*public  Test() {

    }*/
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            //HashMap map = new HashMap();
            //HashSet set = new HashSet();

            List list = new ArrayList();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int j = 0;
            while (list.size() > 1) {
                j = (j + 2) % list.size();
                list.remove(j);
            }
            System.out.println(list.get(0));

        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int ZB = 0;
            int ZM = 0;
            int max = 0;
            int min = 0;
            //求最大公约数；
            //求最小公倍数；
            if (x == y) {
                ZB = 0;
                System.out.println("最大公约数" + ZB);
            }
            if (x > y) {
                max = x;
                min = y;
            } else {
                max = y;
                min = x;
            }
            for (int i = 2; i <= min; i++) {
                if (min % i == 0 && max % i == 0) {
                    ZB = i;
                }
            }
            ZM = max * min / ZB;
            System.out.println("最小公倍数" + ZM);
        }
    }

    public static void main3(String[] args) {
        int x, y;
        x = 5 >> 2;
        y = x >>> 2;
        System.out.println(y);
    }

    public static void main4(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a, b);
        System.out.println(a + "." + b);
    }

    static void operate(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }

    /*public static void main(String[] args) {
        String s;
        //s = "sdc";
        System.out.println("s=" + s);
    }*/

    public static void main5(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        String time = s1.format(date.getTime());
        System.out.println(time);

        SimpleDateFormat s2 = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
        time = s2.format(date.getTime());
        System.out.println(time);
    }

    public static int func(int x) {
        int y = 3;
        try {
            if (x >= 10) {
                return x;
            }
        } catch (Exception e) {
            x = 5;
            return x;
        } finally {
            x = 1;
            return x;
        }
    }

    public static void main6(String[] args) {
        int x = 10;
        System.out.println(func(x));
    }

    public static void main7(String args[]) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print("2");
            }
        });
        t.start();
        t.join();

        System.out.print("1");
    }
}
