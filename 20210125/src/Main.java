/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-25
 * Time: 18:04
 **/
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            int[] array1 = new int[n];
            int[] array2 = new int[n];
            int t = 0;
            double[] JiDian = new double[n];
            double tmp = 0.0;
            double Sum = 0.0;
            double ret = 0.0;
            for(int i = 0; i < n; i++) {
                array1[i] = scan.nextInt();
                t += array1[i];
            }
            for(int i = 0; i < n; i++) {
                array2[i] = scan.nextInt();
            }
            for(int i = 0; i < n; i++) {
                if(array2[i] >= 90 && array2[i] <= 100) {
                    tmp = 4.0;
                }
                if(array2[i] >= 85 && array2[i] <= 89) {
                    tmp = 3.7;
                }
                if(array2[i] >= 82 && array2[i] <= 84) {
                    tmp = 3.3;
                }
                if(array2[i] >= 78 && array2[i] <= 81) {
                    tmp = 3.0;
                }
                if(array2[i] >= 75 && array2[i] <= 77) {
                    tmp = 2.7;
                }
                if(array2[i] >= 72 && array2[i] <= 74) {
                    tmp = 2.3;
                }
                if(array2[i] >= 68 && array2[i] <= 71) {
                    tmp = 2.0;
                }
                if(array2[i] >= 64 && array2[i] <= 67) {
                    tmp = 1.5;
                }
                if(array2[i] >= 60 && array2[i] <= 63) {
                    tmp = 1.0;
                }
                if(array2[i] < 60) {
                    tmp = 0.1;
                }
                JiDian[i] = tmp*array1[i];
                Sum += JiDian[i];
            }
            ret = Sum/t;
            System.out.printf("%.2f",ret);
        }
    }
}
