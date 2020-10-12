/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-12
 * Time: 21:31
 **/
public class Test {
    public static void main1(String[] args) {
        String str = "%20";
        System.out.println(str.length());
    }
    public static String replaceSpace1(String iniString, int length) {
        // write code here
        char[] str = iniString.toCharArray();
        int len = str.length;
        for(int i = 0; i < len; i++) {
            if(str[i] == ' ') {
                for(int j = len; j >= i; j--) {
                    str[j+2] = str[j];
                }
                str[i] = '%';
                str[i+1] = '2';
                str[i+2] = '0';
                len += 2;
            }
        }
        return str.toString();
    }

    public static String replaceSpace2(String iniString, int length) {
        StringBuffer str = new StringBuffer(iniString);
        StringBuffer ptr = new StringBuffer();
        int len = str.length();
        for(int i = len-1; i >= 0; i--) {
            if(str.charAt(i) == ' ') {
                ptr.append("02%");
            }else {
                ptr.append(str.charAt(i));
            }
        }
        return ptr.reverse().toString();
    }

    public static String replaceSpace(String iniString, int length) {
        StringBuffer str = new StringBuffer(iniString);
        int numBlock = 0;
        int j = str.length()-1;
        for(int i = 0; i <= j; i++) {
            if(str.charAt(i) == ' ') {
                numBlock++;
            }
        }
        int newLength = str.length() + 2*numBlock;
        int i = newLength-1;
        str.setLength(newLength);
        while(i >= 0 && j >= 0 && i >= j) {
            if(str.charAt(j) == ' ') {
                str.setCharAt(i--,'0');
                str.setCharAt(i--,'2');
                str.setCharAt(i--,'%');
            }else {
                str.setCharAt(i--,str.charAt(j));
            }
            j--;
        }
        return str.toString();
    }

    public static void main2(String[] args) {
        String iniString = "Mr John Smith";
        int len = iniString.length();
        String ptr = replaceSpace(iniString,len);
        System.out.println(ptr.toCharArray());
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int n = 3;
        /*int i = array.length;
        int j = array[0].length;
        System.out.println(i);
        System.out.println(j);*/
        for(int j = 0; j <= n-1; j++) {
            for(int i = n-1; i >= 0; i--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
