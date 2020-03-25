import java.util.Scanner;

public class Test {

    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            int f1 = 0;
            int f2 = 1;
            int f3 = 0;
            while(f2 < num) {
                f3 = f1+f2;
                f1 = f2;
                f2 = f3;
            }
            if(Math.abs(f1-num) > Math.abs(f2-num)) {
                System.out.println(Math.abs(f2-num));
            }else{
                System.out.println(Math.abs(f1-num));
            }
        }
    }
    public static String func(String str1,String str2) {
        str1 = str1+str2;
        return str1;
    }
    public static void main3(String[] args) {
        String str = "abc";
        System.out.println(func(str, "def"));
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            int[] arr = new int[str.length()];
            for(int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i) - '0';
            }
            for(int i = arr.length-1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int num = scan.nextInt();
            String res = "";
            while(num>0){
                int t1 = num%10;
                int t2 = num/10;
                res = res + String.valueOf(t1);
                num = t2;
            }
            System.out.println(res);
        }
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            int res = 0;
            for(int i = n; i >= 5; i++) {
                int tmp = i;
                while(tmp%5 == 0) {
                    res++;
                    tmp/=5;
                }
            }
            System.out.println(res);
        }
    }

}
