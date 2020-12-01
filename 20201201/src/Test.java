import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-01
 * Time: 15:04
 **/

public class Test {
    public static Boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i =0; i < str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '[' ||str.charAt(i) == '{') {
                stack.add(str.charAt(i));
            }else {
                if(stack.empty()) {
                    //throw new RuntimeException("右括号多！");
                    System.out.println("右括号多！");
                    return false;
                }else{
                    char ch = stack.peek();
                    if(ch == '(' && str.charAt(i) == ')'
                            || ch == '[' && str.charAt(i) == ']'
                            || ch == '{' && str.charAt(i) == '}'){
                        stack.pop();
                    }else {
                        System.out.println("右括号匹配错误！");
                        return false;
                    }

                }
            }
        }
        if(!stack.empty()) {
            return false;
        }else {
            return true;
        }
    }

    private static int Fib(int n) {
        int ret = 1;
        for(int i = 1; i <= n; i++){
            ret *= i;
        }
        return ret;
    }

    //5*4*3*2*1
    public static void main2(String[] args) {
        int n = 20;
        int ret = Fib(n);
        System.out.println(ret);
    }

    public static void main1(String[] args) {
        int a = 123450000;
        String str = new String(a + "");
        System.out.println(str);
    }

    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            String str = new String(num+"");
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i <str.length(); i++) {
                stack.add(str.charAt(i));
            }
            for(int i = 0; i <str.length(); i++) {
                System.out.print(stack.pop());
            }
        }
    }


    //末尾0的个数
    //数字颠倒

    public static void main4(String[] args) {
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);
        System.out.println(j.equals(i));
    }


    private static void testMethod() {
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
        ((Test)null).testMethod();
    }

}
