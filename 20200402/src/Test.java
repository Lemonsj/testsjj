import java.util.Scanner;

public class Test {
    /*public static void func1(int num) {
        if(num > 9) {
            func(num/10);
        }
        System.out.println(num%10);
    }
    public static void main1(String[] args) {
        int num = 1234;
        func(num);
    }*/


    /*public static int  t1 = 0;
    public static int t2 = 0;
    public static void func(int num) {
        if (num > 9) {
            func(num / 10);
        }
        t1 += num%10;
        //return num % 10;

    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num1 = scan.nextInt();
            int num2 = 0;
            int sum1 = 0;
            int sum2 = 0;
            if(num1 <= 9) {
                sum1 = num1;
                num2 = num1*num1;
                func(num2);
                t1 = 0;
                sum2 = t1;
            }else {
                num2 = num1*num1;
                t1 = 0;
                func(num1);
                sum1 = t1;
                t1 = 0;
                func(num2);
                sum2 = t1;
            }
            System.out.println(sum1 + " " + sum2);
        }

    }*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            int m = num*num;
            int sum1 = 0;
            int sum2 = 0;
            if(num < 0 || num > 4000) {
                return;
            }
            while(num > 0) {
                sum1 += num%10;
                num/=10;
            }
            while(m > 0) {
                sum2 += m%10;
                m /= 10;
            }
            System.out.println(sum1 + " " + sum2);
        }
    }


}
