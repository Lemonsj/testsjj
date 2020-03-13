import java.util.Scanner;

public class Test {

    public static int func(int x) {
        int ret = 1;
        for(int i = 1; i <= x; i++) {
            ret *= i;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {
            int num = scan.nextInt();
            System.out.println(func(num));
            /*int tmp = func(num);
            int count = 0;
            String str = tmp + "";
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '0') {
                    count++;
                }
            }
            System.out.println(count);*/

        }
    }
}
