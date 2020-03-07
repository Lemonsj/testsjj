//import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main1(String[] args) {
        HashSet<Character> set = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String ptr = scan.nextLine();
            if(ptr == null) {
                System.out.println(str);
            }
            char[] arr = new char[str.length()];
            for(int i = 0; i < ptr.length(); i++) {
                set.add(ptr.charAt(i));
            }
            int tmp = 0;
            for(int j = 0; j < str.length(); j++) {
                if(!set.contains(str.charAt(j))) {
                    arr[tmp] = str.charAt(j);
                    tmp++;
                }
            }
            System.out.println(arr.clone());
        }
    }

    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            char[] ch = sc.nextLine().toCharArray();
            String str = sc.nextLine();
            for(int i=0;i<ch.length;i++){
                if(!str.contains(String.valueOf(ch[i]))){
                    System.out.print(ch[i]);
                }
            }
        }
    }


    public static int count(int n) {
        if(n%2 != 0 || n == 10 || n < 6) { return -1; }
        if(n%8 == 0) { return n/8; }
        return 1+n/8;
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            System.out.println(count(n));
        }
    }

    public static void main4(String[]args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int tmp = 0;

        while(scan.hasNext()) {
            int n = scan.nextInt();
            while(n > 1) {
                tmp = n/3;
                n= n/3 + n%3;
                count += tmp;
                if(n == 2) {
                    n++;
                }
            }
            System.out.println(count);
        }
    }

    /*public static void fun(){
    }
    public static void main(String[] args) {
        int x,y;
    }*/

    public static int count = 0;
    public static int[] array;
    public static int n = 0;
    public static void func(int x,int y) {
        if(x == 0) {
            count++;

        }
        if(x <=0 || (x>0 && y<0)) {
            return;
        }
        func(x-array[y], y-1);
        func(x,y-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            n = scan.nextInt();
            array = new int[n+1];
            for(int i = 1; i <= n; i++){
                array[i] = scan.nextInt();
            }
        }
        func(40,n);
        System.out.println(count);
    }
}
