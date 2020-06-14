import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-06-14
 * Time: 22:33
 **/
import java.util.*;
public class test {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int x = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                x ^= arr[i];
            }
            int index = 0;
            for (int i = 0; i < 32; i++) {
                if (((x >> i) & 1) == 1) {
                    index = i;
                    break;
                }
            }
            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i < n; i++) {
                if (((arr[i] >> index) & 1) == 1) {
                    num1 ^= arr[i];
                } else {
                    num2 ^= arr[i];
                }
            }
            if (num1 < num2) {
                System.out.println(num1 + " " + num2);
            } else {
                System.out.println(num2 + " " + num1);
            }
        }
    }
}
