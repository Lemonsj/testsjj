import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-04-15
 * Time: 18:55
 **/
public class Test {


    //数组a的长度为n，元素都是正整数，定义目标数值c，
    // 数组a的n个数中一共有c个数的数值不小于c，
    // 剩下的n-c个数都不大于c。求出c的值。



    //2 3 6 1 4
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] ptr = str.split(" ");
            int len = ptr.length;
            int[] array = new int[len];
            for(int i = 0; i < len; i++) {
                array[i] = Integer.parseInt(ptr[i]);
            }

            Arrays.sort(array);
            int i = 0;
            for(; i < len; i++) {
                if(i == array[i] -1 && (len - array[i] == len-i-1)) {
                    System.out.println(array[i]);
                    return;
                }
            }
            if(i == len) {
                System.out.println(-1);
            }
        }
    }*/

    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] ptr = str.split(" ");
            int len = ptr.length;
            int[] array = new int[len];
            for(int i = 0; i < len; i++) {
                array[i] = Integer.parseInt(ptr[i]);
            }
            Arrays.sort(array);
            for(int i = 0; i < len; i++) {
                int c = array[i];
                if(len-i == c && len-c == len-i-1) {
                    System.out.println(c);
                    return;
                }
            }
            System.out.println(-1);

        }
    }*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] ptr = str.split(" ");
            int len = ptr.length;
            int[] array = new int[len];
            for(int i = 0; i < len; i++) {
                array[i] = Integer.parseInt(ptr[i]);
            }
            for(int i = 0; i < len; i++) {
                int c = array[i];
                int[] count = countNum(array,c);
                if(count[0] == c && count[1] == len-c) {
                    System.out.println(c);
                    return;
                }
            }
            System.out.println(-1);

        }
    }
    private static int[] countNum(int[] array, int c) {
        int count1 = 0;
        int count2 = 0;
        int[] count = new int[2];
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= c) {
                count1++;
            }else {
                count2++;
            }
        }
        count[0] = count1;
        count[1] = count2;
        return count;
    }


}
