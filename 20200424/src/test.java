import java.util.*;
public class test {
    public static boolean isBrother(String str1, String str2) {
        char[] ptr1 = str1.toCharArray();
        char[] ptr2 = str2.toCharArray();
        Arrays.sort(ptr1);
        Arrays.sort(ptr2);

        //return (ptr1.equals(ptr2))&&(!ptr1.equals(ptr2));
        return new String(ptr1).equals(new String(ptr2)) && (!str1.equals(str2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            String str = scan.nextLine();
            String[] word = str.split(" ");
            String item = word[word.length-2];
            List<String> list = new ArrayList<>();
            for(int i = 1; i < word.length-2; i++) {
                if(isBrother(word[i], item)) {
                    list.add(word[i]);
                }
            }
            list.sort(String::compareTo);
            System.out.println(list.size());
            int index = Integer.parseInt(word[word.length-1]);

            if(!list.isEmpty() && index <= list.size()) {
                System.out.println(list.get(index-1));
            }
        }
    }
}
