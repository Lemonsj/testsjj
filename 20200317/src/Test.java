/*
import java.util.Scanner;
public class Test {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int max = 0;
            int min = 0;
            int zd = 0;
            int zs = 0;
            if(A > B) {
                max = A;
                min = B;
            }else {
                max = B;
                min = A;
            }
            for(int i = 1; i <= min; i++) {
                if(min % i == 0 && max % i == 0) {
                    zd = i;
                }
            }
            zs = (A*B)/zd;
            System.out.println(zs);
        }
    }
    private static int x = 100;
    public static void main2(String[] args) {
        Test test1 = new Test();
        test1.x++;
        Test test2 = new Test();
        test2.x++;
        test1 = new Test();
        test1.x++;
        Test.x--;
        System.out.println("x = " + x);
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            String p = scan.next();
            for(int i = 1; i <= num/2; i++) {
                int count1 = num/4;
                int count2 = num;
                if(i == 1 || i == num/2) {
                    while(count2>0) {
                        System.out.print(p);
                        count2--;
                    }
                    System.out.println();
                }else {
                    while(count1>0) {
                        System.out.print(p + " ");
                        count1--;
                    }
                    System.out.println();
                }
            }
        }
    }
}
*/












public class Test {
    public static void main(String [] args){
        System.out.println(new B().getValue());
    }
    static class A{
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value++;
                return value;
            } catch(Exception e){
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B() {
            super(5);
            setValue(getValue() - 3);
        }
        public void setValue(int value){
            super.setValue(2 * value);
        }
    }
}

