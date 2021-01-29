/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-29
 * Time: 18:34
 **/
import java.util.*;
public class Test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            int num = scan.nextInt();
            for(int i = 0; i < n; i++) {
                if(array[i] == num) {
                    System.out.println(i);
                    return;
                }
            }
            System.out.println(-1);
        }
    }
}
