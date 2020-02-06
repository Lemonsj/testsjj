public class TestDemo {
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) {
            return true;
        }
        for(int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            for(int j = i+1; j < nums.length; j++) {
                if(tmp == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isLongPressedName(String name, String typed) {
        char[] str1 = name.toCharArray();
        char[] str2 = typed.toCharArray();
        int i = 0;
        int pos = 0;
        for(i = 0; i < str1.length; i++) {
            if(str1[i] != str2[pos]) {
                return false;
            }
            while(str1[i] == str2[pos]) {
                if(i < str1.length-1 && str1[i] == str1[i+1]) {
                    pos++;
                    break;
                }
                if(pos == str2.length-1){
                    if(i == str1.length-1) {
                        return true;
                    }
                    return false;
                }
                pos++;
            }
        }
        return true;
    }
    public int[] sortedSquares(int[] A) {
        int p = 0;
        int q = A.length-1;
        int[] ret = new int[A.length];
        int k = ret.length-1;

        while(p <= q) {
            if(A[p]*A[p] >= A[q]*A[q]) {
                ret[k] = A[p]*A[p];
                p++;
                k--;
            }else {
                ret[k] = A[q]*A[q];
                q--;
                k--;
            }
        }
        return ret;

    }
    public String reverseOnlyLetters(String S) {
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
        String s = str.toString();
        char[] ptr = s.toCharArray();
        int left = 0;
        int right = ptr.length-1;
        while(left < right) {
            char tmp = ptr[left];
            ptr[left] = ptr[right];
            ptr[right] = tmp;
        }
        char[] 
    }
    public static void main(String[] args) {
        String name = "pyplrz";
        String typed = "ppyypllr";
        System.out.println(isLongPressedName(name, typed));
    }
    public static void main1(String[] args) {
        int[] nums = {3,1};
        System.out.println(containsDuplicate(nums));
    }
}
