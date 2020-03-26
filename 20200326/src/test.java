import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public int countWays(int x, int y) {
        // write code here
        //Scanner scan = new Scanner(System.in);
        /*while(scan.hasNext()) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int count = 0;
            for(int i = 0; i < x; i++) {
                for(int j = 0; j < y; j++) {

                }
            }
        }*/
        /*int count = 0;
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {

            }
        }*/
        if(x==1 || y==1) {
            return 1;
        }
        return countWays(x-1,y) + countWays(x,y-1);
    }

    public int add(int a,int b) {
        try{
            return a+b;
        }catch(Exception e) {
            System.out.println("catch语句块");
        }finally{
            System.out.println("finally语句块");
            //return 1234;
        }
        return 0;
    }
    public static void main2(String[] args) {
        test test1 = new test();
        System.out.println("和是：" + test1.add(9,34));
    }
    public final static native int w();
    //abstract final int i = 0;
    //abstract final int func();

    public static void main3(String[] args) {
        byte b1 = 1,b2 = 2,b3,b6;
        final byte b4 = 4,b5 = 6;
        b6 = b4+b5;
        b3 = b2;
    }
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            char[] ptr = str.toCharArray();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < 10; i++) {
                list.add(0);
            }
            for(int i = 0; i < ptr.length; i++) {
                list.set(ptr[i] - '0', list.get(ptr[i]-'0') + 1);
            }

            for(int i = 0; i < 10; i++) {
                if(list.get(i) > 0) {
                    System.out.println(i + " : " +list.get(i));
                }
            }
        }
    }
    public String[] getGray(int n) {
        String[] resStrs = null;
        if(n == 1) {
            resStrs = new String[] {"0", "1"};
        }else {
            String[] strs = getGray(n-1);
            resStrs = new String[2*strs.length];
            for(int i = 0; i < strs.length; i++) {
                resStrs[i] = "0" + strs[i];
                resStrs[resStrs.length-1-i] = "1" + strs[i];
            }
        }
        return resStrs;
    }
}
