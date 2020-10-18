import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-18
 * Time: 17:34
 **/
public class Test {

    public static int[][] clearZero(int[][] mat, int n) {
        boolean[] rowZero = new boolean[n];
        boolean[] colZero = new boolean[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            if(rowZero[i]) {
                for(int j = 0; j < n; j++) {
                    mat[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < n; j++) {
            if(colZero[j]) {
                for(int i = 0; i < n; i++) {
                    mat[i][j] = 0;
                }
            }
        }
        return mat;
    }
    public static void main1(String[] args) {
        /*int a = 'd';
        int b = "d";
        System.out.println(a);*/

        int[][] mat = {{1, 2, 3}, {0, 1, 2}, {0, 0, 1}};
        int[][] ret = clearZero(mat, 3);
        System.out.println(Arrays.deepToString(ret));
    }

    public static boolean checkReverseEqual1(String s1, String s2) {
        // write code here
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        if(s1.length() != s2.length()) {
            return false;
        }
        for(int i = 0; i < s1.length(); i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkReverseEqual(String s1, String s2){
        boolean ret = new String(s1+s1).contains(s2);
        return ret;
    }

    public static void main2(String[] args) {
        String string1 = new String("ABC");
        String string2 = new String("ABC");
        System.out.println(string1 == string2);
        System.out.println();
        String string3 = "ABC";
        String string4 = "ABC";
        String string5 = "AB" + "C";
        System.out.println(string3 == string4);
        System.out.println(string5 == string4);
        System.out.println();
        String string6 = "ABC";
        String string7 = "AB";
        String string8 = string7 + "C";
        System.out.println(string6 == string8);
        System.out.println();
    }

    public static  int upper_bound_ (int n, int v, int[] a) {
        // write code here
        int left = 0;
        int right = n-1;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(a[mid] > v) {
                right = mid-1;
            }else if(a[mid] == v) {
                return mid+1;
            }else {
                left = mid + 1;
            }
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,4,5};
        int n = 5;
        int v = 4;
        int ret = upper_bound_(n,v,array);
        System.out.println(ret);
    }

}

