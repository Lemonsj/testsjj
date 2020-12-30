/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-30
 * Time: 21:03
 **/
public class Test {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix1 (String[] strs) {
        // write code here
        if(strs.length == 0) {
            return "";
        }
        if(strs == null) {
            return null;
        }
        if(strs.length == 1) {
            return strs[0];
        }
        int minLength = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++) {
            if(strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }
        if(minLength == 0){
            return "";
        }
        int[] count = new int[strs.length-1];
        for(int i = 0; i < strs.length-1; i++) {
            for(int j = 0; j < minLength; j++) {
                if(strs[i].charAt(j) == strs[i+1].charAt(j)) {
                    count[i]++;
                }
            }
        }
        int maxCount = Integer.MAX_VALUE;
        for(int i = 0; i < count.length; i++) {
            if(maxCount > count[i]) {
                maxCount = count[i];
            }
        }
        return strs[0].substring(0,maxCount);
    }

    public String longestCommonPrefix (String[] strs) {
        if(strs.length == 0) {
            return "";
        }
        if(strs == null) {
            return null;
        }
        if(strs.length == 1) {
            return strs[0];
        }
        String Prefix = "";
        Prefix = strs[0];
        for(int i = 0; i < strs.length; i++) {
            while(!strs[i].startsWith(Prefix)) {
                Prefix = Prefix.substring
                        (0,Prefix.length()-1);
            }
        }
        return Prefix;

    }
}
