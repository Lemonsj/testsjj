import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-29
 * Time: 15:56
 **/
public class Test {


    //在主串中查找子串
    //朴素算法、KMP算法

    public static int IndexOf1(String src,String dest) {
        if(dest.length() > src.length()) {
            return -1;
        }
        if(src == null || dest == null || src.length() < 1 || dest.length() < 1){
            return -1;
        }
        char[] srcArray = src.toCharArray();
        char[] destArray = dest.toCharArray();
        int tmp = 0;

        for(int i = 0; i < src.length(); i++) {
            if(srcArray[i] == destArray[0] && (i+dest.length() < src.length())) {
                String str = src.substring(i,i+dest.length());
                if(str.equals(dest)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int IndexOf(String src,String dest) {
        if(dest.length() > src.length()) {
            return -1;
        }
        if(src == null || dest == null || src.length() < 1 || dest.length() < 1){
            return -1;
        }
        char[] srcArray = src.toCharArray();
        char[] destArray = dest.toCharArray();

        boolean find = false;
        for(int i = 0; i < src.length(); i++) {
            if(srcArray[i] == destArray[0] && (i+dest.length() < src.length())) {
                /*int j = 0;
                for(; j < dest.length(); j++) {
                    if(srcArray[i+j] != destArray[j]) {
                        break;
                    }
                }
                if(srcArray[i+j] != destArray[j]) {
                    return -1;
                }else {
                    return i;
                }*/
                int count = 0;
                for(int j = 0; j < dest.length(); j++) {
                    if(srcArray[i+j] == destArray[j]) {
                        count++;
                    }
                }

                if(count == dest.length()) {
                    find = true;
                }
            }
            if(find) {
                return i;
            }
        }
        return -1;
    }
    public static void main2(String[] args ) {
        String src = "abcdefghabcde";

        String dest = "def";
        int ret = IndexOf(src,dest);
        System.out.println(ret);
    }

    public static void main1(String[] args) {
        String str = "";
        String str2 = null;
        System.out.println(str.length());
        System.out.println(str2.length());
    }


    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*int q  = scan.nextInt();*/
        //String str = scan.nextLine();
        String str1 = scan.next();
        System.out.println("🐱🐱🐱🐱🐱🐱");
    }
;

    public static void main4(String[] args) {
        String str = "abc def gh";
        String[] strings = str.split(" ");
        String ptr = "";
        for(int i = 0; i < str.length(); i++) {
            ptr += strings[i];
        }
        System.out.println(ptr);
    }


    public static void main5(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
        System.out.println(str.toString());
    }

    private static String reverse(String str,int begin, int end) {
        char[] ptr = str.toCharArray();
        char tmp = ' ';
        while(begin < end) {
            tmp = ptr[begin];
            ptr[begin] = ptr[end];
            ptr[end] = tmp;
            begin++;
            end--;
        }
        //return ptr.toString();
        //return new String(ptr);
        return String.copyValueOf(ptr);
    }

    public static void main(String[] args) {
        System.out.println("***********");
        String str = "abcdef";
        System.out.println(str.toCharArray());

        /*char[] ptr = {'a','b','c','d','e','f'};
        System.out.println(Arrays.toString(ptr));*/
    }

}
