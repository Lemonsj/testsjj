import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-06
 * Time: 22:18
 **/
public class Test {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        while(scan.hasNext()) {
            int x = scan.nextInt();
            int ret = reverse(x);
            System.out.println(ret);
        }

    }

    public static int reverse(int x) {
        String str = new String(x+"");
        if(str.length() == 1) {
            return x;
        }
        String p = "";
        if(str.charAt(0) == '-') {
            p = p + str.charAt(0);
        }
        for(int i = str.length()-1; i >= 0; i--) {
            if(i == 0 && (str.charAt(0) == '-' || str.charAt(0) == '0')) {
                break;
            }
            p = p + str.charAt(i);
        }
        int ret = Integer.parseInt(p);
        return ret;
    }


    public int reverse1(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

}
