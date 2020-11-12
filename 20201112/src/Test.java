import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-12
 * Time: 16:40
 **/
public class Test {
    public static void main(String[] args) {
        int[] array = {1,3,2,5,4,7,9,6};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0) {
            return "";
        }

        String[] str = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>(

        ) {
            @Override
            public int compare(String s1,String s2) {
                String a = s1+s2;
                String b = s2+s1;
                return a.compareTo(b);
            }
        });

        StringBuffer stf = new StringBuffer();
        for(int i = 0; i < str.length; i++) {
            stf.append(str[i]);
        }

        return stf.toString();
    }

    public class Solution {
        public int FirstNotRepeatingChar(String str) {
            if(str == null || str.length()< 1){
                return -1;
            }
            char[] ch = str.toCharArray();
            HashSet<Character> set = new HashSet<Character>();
            for(int i = 0 ; i < str.length()-1; i++){
                for(int j = i+1 ; j < ch.length;j++){
                    if(set.contains(ch[i])){
                        break;
                    }
                    if(ch[i]==ch[j]){
                        set.add(ch[i]);
                        break;
                    }
                    if(j==ch.length-1){
                        return i;
                    }
                }
            }
            return -1;
        }
    }

}
