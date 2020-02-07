public class Test {
    public  static String reverseOnlyLetters2(String S) {
        if (S == null) {
            return S;
        }
        //取得所有为字母的字符，组成一个字母字符串
        StringBuffer str = new StringBuffer("");
        for (int i = 0; i < S.length(); i++) {
            char val = S.charAt(i);
            if ((val >= 'a' && val <= 'z') || (val >= 'A' && val <= 'Z')) {
                str.append(val);
            }
        }
        //反转字母字符串
        str.reverse();
        StringBuffer s1 = new StringBuffer(S);
        //用反转后的字母字符串中的字符替换原字符串中的字母
        int k = 0;
        for (int i = 0; i < s1.length(); i++) {
            char val = s1.charAt(i);
            if ((val >= 'a' && val <= 'z') || (val >= 'A' && val <= 'Z')) {
                String value = "" + str.charAt(k);
                s1.replace(i,i+1,value);
                k++;
            }
        }
        return s1.toString();
    }


    public static String reverseOnlyLetters(String S) {
        if(S == null) {
            return null;
        }
        StringBuffer str = new StringBuffer("");
        for(int i = 0; i < S.length(); i++) {
            char tmp = S.charAt(i);
            if((tmp >= 'a' && tmp <= 'z') || (tmp >= 'A' && tmp <= 'Z')) {
                str.append(tmp);
            }
        }
        str.reverse();
        /*String s = str.toString();
        char[] ptr1 = s.toCharArray();
        int left = 0;
        int right = ptr1.length-1;
        while(left < right) {
            char tmp = ptr1[left];
            ptr1[left] = ptr1[right];
            ptr1[right] = tmp;
        }*/
        String s = str.toString();
        char[] ptr1 = s.toCharArray() ;
        char[] ptr2 = S.toCharArray();
        int j = 0;
        for(int i = 0; i < ptr2.length; i++) {
            if((ptr2[i] >= 'a' && ptr2[i] <= 'z') || (ptr2[i] >= 'A' && ptr2[i] <= 'Z')) {
                ptr2[i] = ptr1[j];
                j++;
            }
        }
        /*StringBuffer ret = new StringBuffer(ptr2.toString());
        return ret.toString();*/
        String t = ptr2.toString();
        String ret = new String(t);
        return ret;
    }

    public static void main1(String[] args) {
        String str1 = "ab-cd";
        String ret = reverseOnlyLetters(str1);
        System.out.println(ret);
    }

    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println(date.getTime());
    }
}
