import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-10
 * Time: 17:57
 **/
public class Test {
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T != 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] array = new int[2*n];
            for(int i = 0; i < 2*n; i++) {
                int tmp = i;
                for(int j = 0; j < k; j++) {
                    if(tmp < n) {
                        tmp = 2*tmp;
                    }else {
                        tmp = 2*(tmp-n)+1;
                    }
                }
                array[tmp] = scan.nextInt();
            }
            for(int i = 0; i < 2*n; i++) {
                if(i == 2*n-1) {
                    System.out.print(array[i]);
                }else {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println();
            T--;
        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            if(n == 0) {
                return;
            }
            int[] array = new int[n];
            for(int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            int k = scan.nextInt();
            int count = 0;
            for(int i = 0; i < n; i++) {
                if(array[i] == k) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        int i = 5;
        int s = (i++) + (++i) + (i--) + (--i);
        System.out.println(s);
    }
}
