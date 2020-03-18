import java.math.BigInteger;
import java.util.Scanner;
public class Test {
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int num = scan.nextInt();
            String p = scan.next();
            for (int i = 1; i <= num / 2; i++) {
                int count1 = num / 4;
                int count2 = num;
                if (i == 1 || i == num / 2) {
                    while (count2 > 0) {
                        System.out.print(p);
                        count2--;
                    }
                    System.out.println();
                    if (num / 2 == 1) {
                        count2 = num;
                        while (count2 > 0) {
                            System.out.print(p);
                            count2--;
                        }
                    } else {
                        while (count1 > 0) {
                            System.out.print(p + " ");
                            count1--;
                        }
                        System.out.println();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();
            BigInteger A = new BigInteger(str1);
            BigInteger B = new BigInteger(str2);
            BigInteger ret = A.add(B);
            System.out.println(ret);
        }
    }
}
