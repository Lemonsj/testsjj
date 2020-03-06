import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        int ret = 0;
        int tmp = 0;
        String arr[] = str.split(" ");
        for(int i = 0; i < arr.length; i++) {
            ret = arr[i].length();
            if(ret > count) {
                count = ret;
                tmp = i;
            }
        }
        System.out.println(arr[tmp]);
    }

    //abcd12345ed125ss123456789

    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        int i = 0;
        int max = 0;
        int tmp = 0;
        while(i < str.length()) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
                if(count > max) {
                    max = count;
                    tmp = i;
                }
            }else {
                count = 0;
            }
            i++;
        }
        System.out.println(str.substring(tmp-count+1,tmp+1));
    }*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int i = 0;
        int max = 0;
        int tmp = 0;
        while(scan.hasNext()) {
            String str = scan.nextLine();
            while(i < str.length()) {
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    count++;
                    if(count > max) {
                        max = count;
                        tmp = i;
                    }
                }else {
                    count = 0;
                }
                i++;
            }
            System.out.println(str.substring(tmp-count+1,tmp+1));
        }

    }



    public static boolean chkParenthesis(String A, int n) {
        // write code here
        /*Stack<Character> ptr = new Stack<>();
        for(int i = 0; i < n; i++) {
            char c = A.charAt(i);
            if (c == '(') {
                ptr.push(c);
            } else {
                if (c != ')') {
                    return false;
                }
                ptr.pop();
            }
        }
        return true;*/
        Stack<Character> ptr = new Stack<>();
        if(A == null || A.length() != n) {
            return false;
        }
        for(int i = 0; i < n; i++) {
            if (A.charAt(i) == '(') {
                ptr.push(A.charAt(i));
            } else if (A.charAt(i) == ')'){
                if(ptr.empty()) {
                    return false;
                }else {
                    ptr.pop();
                }
            }else {
                return false;
            }
        }
        return true;

    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        System.out.println(chkParenthesis(str,n));
    }
}
