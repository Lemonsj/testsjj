import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ErrorFile {
    String filename;
    int linenum;
    int count = 1;
}
public class Test {
    /*public static void reverse(char[] ptr, int left,int right) {
        while(left <= right) {
            char tmp = ptr[left];
            ptr[left] = ptr[right];
            ptr[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            //int n = scan.nextInt();
            String str = scan.next();
            char[] ptr = str.toCharArray();
            int left = 0;
            int right = str.length() - 1;
            reverse(ptr, left, right);
            while (left < right && right < str.length()) {
                if ((right + 1 == ' ') || (right + 1 == '\0')) {
                    reverse(ptr, left, right);
                    left = right + 2;
                } else {
                    right++;
                }
            }
            System.out.println(ptr.toString());
        }
    }*/

    /*public static void reverse(char[] ptr, int left, int right) {
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
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.next();
            char[] ptr = str.toCharArray();
            int len = ptr.length;
            reverse_All(ptr,len);
            System.out.println(ptr);
        }
    }*/

    /*public static String reverse(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        String[] ptr = str.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = ptr.length - 1; i >= 0; i--) {
            list.add(ptr[i]);
        }
        StringBuffer sp = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                sp.append(list.get(i) + " ");
            } else {
                sp.append(list.get(i));
            }
        }
        return sp.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            System.out.println(reverse(str));

        }
    }*/

    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.next();
            *//*if (str == null || str.length() == 0) {
                return "";
            }*//*
            String[] ptr = str.split(" ");
            List<String> list = new ArrayList<>();
            for (int i = ptr.length - 1; i >= 0; i--) {
                list.add(ptr[i]);
            }
            StringBuffer sp = new StringBuffer();
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() - 1) {
                    sp.append(list.get(i) + " ");
                } else {
                    sp.append(list.get(i));
                }
            }
            System.out.println(sp.toString());
        }
    }*/


    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            String[] ptr = str.split(" ");
            for(int i = ptr.length-1; i>=0; i--){
                if(i>=1){
                    System.out.print(ptr[i] + " ");
                }else {
                    System.out.print(ptr[i]);
                }
            }
        }
    }*/
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<ErrorFile> list = new ArrayList<>();
        while(scan.hasNext()) {
            ErrorFile record = new ErrorFile();
            String str = scan.nextLine();
            String[] ptr = str.split(" ");
            String name = ptr[0];
            int index = name.lastIndexOf("\\");
            record.filename = (index < 0) ? name: name.substring(index+1);
            record.linenum = Integer.parseInt(ptr[1]);

            for(ErrorFile e : list) {
                if(e.filename.equals(record))
            }
        }
    }

    public abstract class Car{};

    int a=0;
    int b;

    public static void main(String[] args) {
        int s;
        int t = 0;
    }
}
