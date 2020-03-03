import java.util.HashSet;
import java.util.Scanner;

class classA{
    public int i;
    static String s;
    void method1(){};
    static void method2(){};
}
public class Test {
    /*static int i;
    public static void main(String[] args) {
        System.out.println(i);
    }*/

    public static void main1(String[] args) {
        classA a = new classA();
        a.method1();
        classA.method2();
        //classA.method1();
        System.out.println(a.i);

    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        while (scan.hasNext()) {
            String str = scan.nextLine();

            String array[] = str.split(" ");
            for (int i = 0; i < array.length; i++) {
                set.add(array[i]);
            }
        }
        System.out.println(set.size());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = 0;

        while(f2 < n) {
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }
        if(Math.abs(f2-n) > Math.abs(f1-n)) {
            System.out.println(Math.abs(f1-n));
        }else {
            System.out.println(Math.abs(f2-n));
        }
    }
}
