/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-09
 * Time: 21:17
 **/
public class Test {
    public static void main1(String[] args) {
        Integer s = Integer.parseInt("ABCDEF",16);
        System.out.printf("%15d",s);
    }

    public static void main2(String[] args) {
        String str = "ABCDEF";
        int sum = 0;
        int n = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch(c) {
                case 'A':
                    n = 10;
                    break;
                case 'B':
                    n = 11;
                    break;
                case 'C':
                    n = 12;
                    break;
                case 'D':
                    n = 13;
                    break;
                case 'E':
                    n = 14;
                    break;
                case 'F':
                    n = 15;
                    break;
                default:
                    System.out.println("error");
                    break;

            }
            sum += n*(int)(Math.pow(16,(str.length()-i-1)));
        }
        System.out.printf("%15d",sum);
    }

    public static void main(String[] args) {
        String s = "Hello world！";
        System.out.println(s);
        System.out.println(s.length());
    }
}
