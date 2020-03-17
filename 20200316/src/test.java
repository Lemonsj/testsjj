import java.util.Scanner;

public class test {

    public static void add(Byte b) {
        b = b++;
    }

    public static void main1(String[] args) {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] strs = str.split(" ");
            int[] arr = new int[strs.length];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(strs[i]);

            }
            int num = arr[0];
            int count = 0;
            for(int j = 1; j < arr.length; j++) {
                if(arr[j] == num) {
                    count++;
                }else if(count > 0) {
                    count--;
                }else {
                    num = arr[j];
                }
            }
            System.out.println(num);
        }
    }
    /*public static void func() {
        String str = "abcd";
        int[] arr = new int[str.length()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i) + "";
        }
    }*/
}
