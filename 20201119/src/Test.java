/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-19
 * Time: 21:22
 **/
public class Test {
    public static void main(String[] args) {

    }

    public void reserve(char[] str,int start,int end) {
        if(str == null || str.length < 0 || start < 0 || start > end) {
            return;
        }
        while(start < end) {
            char tmp = str[start];
            str[start] = str[end];
            str[end] = tmp;
            start++;
            end--;
        }
    }
    public String LeftRotateString(String str,int n) {
        //StringBuffer ptr = new StringBuffer(str);
        char[] ptr = str.toCharArray();
        if(ptr != null) {
            int len = ptr.length;
            if(len > 0 && n > 0 && n < len) {

                int start = 0;
                int end = n-1;
                int secondStart = n;
                int secondEnd = len-1;
                reserve(ptr,start,end);
                reserve(ptr,secondStart,secondEnd);
                reserve(ptr,0,len-1);
            }
        }
        return new String(ptr);
    }
}
