/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-03
 * Time: 19:17
 **/
public class Test {
    public static boolean isPali(String str) {
        int i = 0;
        int j = str.length()-1;
        if(str.length() == 1) {
            return true;
        }
        while(i <= j) {
            if(str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
    public static int getLongestPalindrome(String A,int n) {
        if(A == null || n < 1) {
            return -1;
        }
        //String result = "";
        int max = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                String tmp = A.substring(i,j);
                boolean ret = isPali(tmp);
                if(ret && tmp.length() > max) {
                    //result = tmp;
                    max = j-i;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String A = "cbc";//abc1234321ab
        String tmp = A.substring(0,2);
        /*System.out.println(tmp);
        System.out.println(A);*/
        int n = A.length();
        int ret = getLongestPalindrome(A,n);
        System.out.println(ret);
    }



    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);

            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len-1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public static  int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return (R-1) - (L+1) + 1;
    }
}
