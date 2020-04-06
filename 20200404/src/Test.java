import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String num = scan.nextLine();

            int p = Integer.parseInt(num);
            if(p <= 2 || p >= 100) {
                return;
            }
            String tmp = String.valueOf(p*p);
            char[] str = tmp.toCharArray();
            char[] ptr = num.toCharArray();
            for(int i = 0; i < str.length-1; i++) {
                if(str[i+1] != ptr[i] ) {
                    System.out.println("No!");
                    return;
                }
            }
            System.out.println("Yes!");
        }
    }
}
