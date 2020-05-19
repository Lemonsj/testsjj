import java.util.Scanner;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-19
 * Time: 21:41
 **/

//括号字符串的有效性
public class test {
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c != '(' && c != ')'){
                    System.out.println("NO");
                    return;
                }else if (c == '(') {
                    stack.add(c);
                }else {
                    if(stack.size() > 0){
                        stack.pop();
                    }else{
                        System.out.println("NO");
                        return;
                    }


                }
            }
            if(stack.size() == 0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            int count = 0;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c != '(' && c != ')'){
                    System.out.println("-1");
                    return;
                }else if (c == '(') {
                    stack.add(c);
                }else {
                    if(stack.size() > 0){
                        stack.pop();
                        count += 2;
                    }else{
                        System.out.println(count);
                        return;
                    }


                }
            }
            System.out.println(count);
        }
    }
}
