import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;

        while(scan.hasNext()) {
            int A,B,C;
            int p1 = scan.nextInt();
            int p2 = scan.nextInt();
            int p3 = scan.nextInt();
            int p4 = scan.nextInt();

            p1 = A-B;
            p2 = B-C;
            p3 = A+B;
            p4 = B+C;
        }

    }
}
