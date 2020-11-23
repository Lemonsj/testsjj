import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-23
 * Time: 21:01
 **/
public class Test {


    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        int count = 0;
        for(int i = 0; i < str1.length(); i++) {
            StringBuffer ptr = new StringBuffer(str1);
            ptr.insert(i,str2);
            Boolean ret = func(ptr);
            if(ret == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static Boolean func(StringBuffer ptr) {
        int i = 0;
        int j = ptr.length()-1;
        while(i < j) {
            if(ptr.charAt(i) != ptr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        int count = 0;
        for(int i = 0; i < str1.length(); i++) {
            String str = str1.substring(0,i) +
                    str2 + str1.substring(i,str1.length());
            StringBuffer ptr = new StringBuffer(str1);
            if(ptr.reverse().toString().equals(str)) {
                count++;
            }

        }
        System.out.println(count);
    }

    public static void main3(String[] args) {
        int[] arr = {1,3,5,2,2};
        int ret = findKth(arr,5,3);
        System.out.println(ret);
    }

    public static int findKth(int[] a, int n, int K) {
        // write code here
        Arrays.sort(a);
        return a[K-1];
    }

    static int i;
    public static void main4(String[] args) {
        System.out.println(i);
    }


}

class Test1{
    private int data;
    int result = 0;
    public void m(){
        result += 2;
        data +=2;
        System.out.print(result + " " + data);
    }
}

class ThreadExample extends Thread{
    private Test1 mv;
    public ThreadExample(Test1 mv) {
        this.mv = mv;
    }

    public void run() {
        synchronized (mv) {
            mv.m();
        }
    }
}

class ThreadTest {
    public static void main(String[] args){
        Test1 mv = new Test1();
        Thread t1 = new ThreadExample(mv);
        Thread t2 = new ThreadExample(mv);
        Thread t3 = new ThreadExample(mv);

        t1.start();
        t2.start();
        t3.start();
    }
}


