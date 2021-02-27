import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-02-27
 * Time: 14:51
 **/
public class Test {

    public static void main(String[] args) {

    }

    public static int[] sortedSqares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static String reverseOnlyLetters1(String S) {
        char[] str = S.toCharArray();
        int left = 0;
        int right = str.length;
        while(left < right) {
            while(left < right && (str[left] < 'A' || str[left] > 'z' || (str[left] > 'Z' && str[left] < 'a'))){
                left++;
            }
            while(left < right && (str[right] < 'A' || str[right] > 'z' || (str[right] > 'Z' && str[right] < 'a'))) {
                right--;
            }
             char tmp = str[left];
            str[left] = str[right];
            str[right] = tmp;
        }
        return Arrays.toString(str);
    }

    class Solution {
        public String reverseOnlyLetters(String S) {
            if (S == null) {
                return S;
            }
            StringBuffer str = new StringBuffer("");
            for (int i = 0; i < S.length(); i++) {
                char val = S.charAt(i);
                if ((val >= 'a' && val <= 'z') || (val >= 'A' && val <= 'Z')) {
                    str.append(val);
                }
            }
            str.reverse();
            StringBuffer s1 = new StringBuffer(S);
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
    }

    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int x : nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length; i++) {
            if (2 * leftSum + nums[i] == sum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

}
