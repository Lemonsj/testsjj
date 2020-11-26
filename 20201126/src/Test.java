import java.util.HashSet;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-26
 * Time: 22:09
 **/
public class Test {

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();
            HashSet<Character> set = new HashSet<>();
            for(int i = 0; i < str2.length(); i++) {
                set.add(str2.charAt(i));
            }
            StringBuffer ptr = new StringBuffer();
            for(int i = 0; i < str1.length(); i++) {
                if(!set.contains(str1.charAt(i))) {
                    ptr.append(str1.charAt(i));
                }
            }
            System.out.println(ptr.toString());
        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            //袋数尽可能少
            int min = n;
            int tmp = 0;
            for(int i = 0; i <= n/6; i++) {
                for(int j = 0; j <= n/8; j++) {
                    if(6*i + 8*j == n) {
                        tmp = i+j;
                        if(min > tmp) {
                            min = tmp;
                        }
                    }
                }
            }
            System.out.println(min);
        }
    }
}

class Super{
    private static void a() {
        //类方法
    }

    public static void b() {
        //类方法
    }

    public void c() {
        //实例方法
    }

    private void d() {
        //实例方法
    }
}

class Son extends Super{
    public static void main(String[] args) {
        Super s = new Super();
        Super.b();
    }
}
