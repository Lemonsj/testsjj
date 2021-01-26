import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-26
 * Time: 18:34
 **/
public class Test {
    public static int func(int num) {
        int sum = 0;
        while(num > 0) {
            int t = num%10;
            num /= num;
            sum += t;
        }
        return sum;
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            int p = num*num;
            int ret1 = func(num);
            int ret2 = func(p);
            System.out.println(ret1 + " " + ret2);
        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            String str = num + "";
            String ptr = num*num + "";
            int ret1 = 0;
            int ret2 = 0;
            for(int i = 0; i < str.length(); i++) {
                int a = Integer.parseInt(str.charAt(i) + "");
                ret1 += a;
            }
            for(int i = 0; i < ptr.length(); i++) {
                int a = Integer.parseInt(ptr.charAt(i) + "");
                ret2 += a;
            }
            System.out.println(ret1 + " " + ret2);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            String[] names = new String[n];
            Map<String,Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                names[i] = scan.next();
                map.put(names[i],0);
            }
            int v = scan.nextInt();
            while((--v) >= 0) {
                String s = scan.next();
                if(map.containsKey(s)) {
                    map.put(s,map.get(s) + 1);
                }else {
                    map.put(names[n],map.get(names[n]) + 1);
                }
            }
            StringBuilder sb = new StringBuilder();
            for(String s : names) {
                sb.append(s).append(" : ").append(map.get(s)).append('\n');
            }
            System.out.print(sb.toString());
        }
        scan.close();
    }
}
