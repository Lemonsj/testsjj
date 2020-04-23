import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            List<Character> list = new ArrayList<>();
            for(int i = 0; i < str.length(); i++) {
                list.add(str.charAt(i));
            }
            for(int j = 0; j < list.size(); j++) {
                if(list.get(j) == '_') {
                    char p =Character.toUpperCase(list.get(j+1));
                    list.remove(j+1);
                    list.add(j+1,p);
                    list.remove(j);
                }
            }
            for (Character x :list) {
                System.out.print(x);
            }
            /*StringBuffer ptr = new StringBuffer(str);
            for(int i = 0; i < ptr.length(); i++) {
                if(ptr.charAt(i) == '_') {
                    ptr.replace(i+1,i+1,Character.toUpperCase(ptr.charAt(i))+"");
                }
            }
            System.out.println(ptr.toString());*/
        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            //char[] ptr = str.toCharArray();
            for(int i = 0; i < str.length(); i++) {
                int tmp = 0;
                if(str.charAt(i) == ' ') {

                }
            }
        }
    }
    public static void reverse(char[] ptr, int left, int right) {
        while(left <= right) {
            char tmp = ptr[left];
            ptr[left] = ptr[right];
            ptr[right] = tmp;
            left++;
            right--;
        }
    }
    public static void reverse_All(char[] ptr, int len) {
        int left = 0;
        int right = len-1;
        reverse(ptr,left,right);
        right = 0;
        while(ptr[right] != '\0') {
            left = right;
            while(ptr[right] != '\0' && ptr[right] != ' ') {
                right++;
            }
            right -= 1;
            reverse(ptr,left,right);
            if(ptr[right] == ' ') {
                right++;
            }

        }
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.next();
            char[] ptr = str.toCharArray();
            int len = ptr.length;
            reverse_All(ptr,len);
            System.out.println(ptr);
        }
    }

    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] split = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for(int i = 0; i <split.length; i++) {
            stack.push(split[i]);
        }
        for(int i = 0; i <split.length; i++) {
            String pop = stack.pop();
            stringBuilder = stringBuilder.append(pop+" ");
        }
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] ptr = str.split(" ");
            char[] str1 = ptr[0].toCharArray();
            char[] ptr1 = ptr[1].toCharArray();
            List<Character> list = new ArrayList<>();
            for(int i = 0; i < str1.length; i++){
                list.add(str1[i]);
            }
            int j = 0;
            for(j = 0; j < ptr1.length; j++) {
                if(list.contains(ptr1[j])) {
                    list.remove(list.lastIndexOf(ptr1[j]));
                }else {
                    break;
                }
            }
            if(j == ptr1.length) {
                if(list.size() >= 0) {
                    System.out.println("Yes");
                }
            }else {
                System.out.println("No");
            }

        }
    }
}
