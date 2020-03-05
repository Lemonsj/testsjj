import java.util.Scanner;

public class Test {
    public static int func(int n) {
        int tmp = 0;
        int ptr = 0;
        int number = 0;
        while(n > 0) {
            tmp = n/3;
            n = n%3 + tmp;
            number += tmp;
        }
        return number;
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = func(n);
        System.out.println(ret);
    }


    public static boolean isHuiwen(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        int count = 0;
        for(int i = 0; i <= str1.length(); i++) {
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i,str2);
            if(isHuiwen(sb.toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
