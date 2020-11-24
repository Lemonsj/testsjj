import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-24
 * Time: 22:19
 **/
public class Test {

    public static void main1(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int number = scan.nextInt();
            int tmp = 0;
            int count = 0;
            if(number == 0) {
                return;
            }
            while(number > 1){
                if(number == 2) {
                    number += 1;
                }
                tmp = number/3;
                count += tmp;
                number = tmp + number%3;
            }
            System.out.println(count);
        }
    }

    public static int count(int[] A, int n) {
        // write code here
        int count = 0;
        for(int i = 0; i < A.length; i++) {
            for(int j = i+1; j < A.length; j++) {
                if(A[i] > A[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main2(String[] args) {
        int[] A = {1,2,3,4,5,6,7,0};
        int ret = count(A,8);
        System.out.println(ret);
    }
}

class Base {
    Base() {
        System.out.println("Base");
    }
}
class Alpha extends Base{
    public static void main3(String[] args) {
        new Alpha();
        new Base();
    }
}



class test{
    public int aMethod() {
        //static
        int i = 0;
        i++;
        return i;
    }

    public static void main(String[] args) {
        test test1 = new test();
        test1.aMethod();
        int j = test1.aMethod();
        System.out.println(j);
    }
}

