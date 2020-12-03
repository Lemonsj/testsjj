import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-03
 * Time: 16:38
 **/
public class Test {
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            int minCount = 0;
            int a = 0;
            int b = 1;
            int c = 0;
            while(true) {
                c = a+b;
                if(b <= num && c >= num) {
                    break;
                }
                a = b;
                b = c;
            }
            if((num-b) > (c - num)) {
                minCount = c - num;
            }else {
                minCount = num-b;
            }
            System.out.println(minCount);
        }
    }

    public static int add(int a,int b) {
        try{

            return a+b;
        }catch(Exception e) {
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }
        return 0;
    }
    public static void main(String[] args) {
       Test test = new Test();
        int ret = test.add(0,34);
        System.out.println("和是："+ret);
    }
}
