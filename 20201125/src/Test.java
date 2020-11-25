import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-25
 * Time: 15:51
 **/
public class Test {



    public static boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            if(A.charAt(i) != '('  && A.charAt(i) != ')'){
                return false;
            }
            if(A.charAt(i) == '(') {
                stack.add(A.charAt(i));
            }else if(A.charAt(i) == ')'){
                stack.pop();
            }
        }
        if(stack.size() == 0) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String str = "((())";
        Boolean flag = chkParenthesis(str,5);
        System.out.println(flag);
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            char[] ptr = str.toCharArray();
            int count = 0;
            int max = 0;
            int i = 0;
            int end = 0;
            for(; i < ptr.length; i++) {
                if(ptr[i] <= '9' && ptr[i] >= '0'){
                    count++;
                    if(count > max) {
                        max = count;
                        end = i;
                    }
                }else {

                    count = 0;
                }
            }
            String p = str.substring(end-max+1,end+1);
            System.out.println(p);
        }
    }
}
