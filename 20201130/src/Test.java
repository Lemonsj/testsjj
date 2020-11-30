import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-30
 * Time: 19:47
 **/
public class Test {

    //不要二
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            int count = 0;
            int[][] array = new int[m][n];
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(array[i][j] == 0){
                        count++;

                        if(i+2 < m) {
                            array[i+2][j] = -1;
                        }

                        if(j+2 < n) {
                            array[i][j+2] = -1;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }

    //求最小公倍数
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            for(int i = 1; i <= m*n; i++) {
                if(i%m == 0 && i%n ==0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    //求最小公倍数
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            //先求最大公约数
            int min = 0;
            if( m < n) {
                min = m;
            }else {
                min = n;
            }
            int tmp = 0;
            for(int i = 1; i <= min; i++) {
                if(m % i == 0 && n % i == 0) {
                    tmp = i;
                }
            }
            int count = m*n/tmp;
            System.out.println(count);
        }
    }
}
