import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class test {
    public String numberToLetter(int num) {
        if (num <= 0) {
            return null;
        }
        String letter = "";
        num--;
        do {
            if (letter.length() > 0) {
                num--;
            }
            letter = ((char) (num % 26 + (int) 'A')) + letter;
            num = (int) ((num - num % 26) / 26);
        } while (num > 0);

        return letter;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            //HashSet<Character> set = new HashSet<>();
            List<Integer> list = new ArrayList<>();
            char[] ptr = str.toCharArray();
            for(int i = 0; i < 26; i++) {
                list.add(0);
            }
            for(int i = 0; i < str.length(); i++) {
                if(ptr[i] >= 'A' && ptr[i] <= 'Z'){
                    list.set(ptr[i]-'0'-17,list.get(ptr[i]-'0'-17)+1);
                }

            }
            String t = "";
            for(int i = 0; i < list.size(); i++) {
                if(ptr[i] >= 'A' && ptr[i] <= 'Z') {
                    t = (char)(i+65)+"";//((i+17)+'0')
                    System.out.println(t+ ":"+list.get(i));
                }
            }

        }
    }
}
