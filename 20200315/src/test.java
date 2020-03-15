import java.util.HashSet;
import java.util.Scanner;

public class test {

    public static void main1(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        while(scan.hasNext()) {
            int num = scan.nextInt();
            String str = num + "";
            for(int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }
            int[] count = new int[set.size()];
            for(int j = 0; j < set.size(); j++) {
                for(int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == set.iterator(i)) {

                    }
                }
            }
        }*/

        Scanner scan = new Scanner(System.in);
        //HashSet<Character> set = new HashSet<>();
        while(scan.hasNext()) {
            int num = scan.nextInt();
            int[] p = {};
            String str = num + "";
            for(int i = 0; i < str.length(); i++) {
                p[str.charAt(i) - 48]++;
            }
            for(int j = 0; j < 10; j++) {
                if(p[j] != 0) {
                    System.out.printf("%d:%d\n",j,p[j]);
                }
            }
        }
    }


    //char[] array = str.toCharArray();--》字符串转成字符数组
    //   return String.copyValueOf(array);

    public static void main(String[] args) {
        String str = "abcdef";
        char[] array = str.toCharArray();//--》字符串转成字符数组
        System.out.println(String.copyValueOf(array));
    }
    //n个数里出现次数大于等于n/2的数


}
