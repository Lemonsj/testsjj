import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();

            HashSet<Character> set = new HashSet<>();
            List<Character> list  = new ArrayList<>();
            //char[] ptr1 = str1.toCharArray();
            char[] ptr2 = str2.toCharArray();
            for(int i = 0; i < str1.length(); i++) {
                list.add(str1.charAt(i));
            }
            for(int i = 0; i < ptr2.length; i++) {
                set.add(ptr2[i]);
            }
            for(int i = 0; i <list.size(); i++) {
                if(set.contains(list.get(i))) {
                    list.remove(i);
                }
            }
            for(int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
        }
    }
}
*/
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String str[] = string.split(" ");
        for (int i = str.length - 1; i >= 1; i--) {
            System.out.print(str[i]+ " ");
        }
        System.out.print(str[0]);
    }
}