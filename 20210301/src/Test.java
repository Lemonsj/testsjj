import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-01
 * Time: 15:27
 **/
public class Test {
    public static void main1(String[] args) {
        String s = "4193 with words";
        int ret = myAtoi(s);
        System.out.println(ret);
    }

    public static int myAtoi1(String s) {
        StringBuffer ret = new StringBuffer();
        boolean flag = false;
        boolean t = false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                if(s.charAt(i) == '-') {
                    ret.append(s.charAt(i));
                }else {
                    if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                        ret.append(s.charAt(i));
                        t = true;
                    }else {
                        flag = true;
                    }
                }
            }
            if(flag == true && t == false) {
                return 0;
            }
        }
        return Integer.parseInt(ret.toString());
    }


    public static int myAtoi(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        long ret = 0;
        boolean flag = false;
        s = s.trim();
        for(int i = 0; i < s.length(); i++) {
            if(i == 0) {
                if(s.charAt(i) == '-') {
                    flag = true;
                    continue;
                }else if(s.charAt(i) == '+') {
                    flag = false;
                    continue;
                }
            }

            if(s.charAt(i) <= '9' && s.charAt(i) >= '0'){
                int num = s.charAt(i) - '0';
                ret = ret * 10 + num;
                if(!flag) {
                    if(ret > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                }else {
                    if(ret*(-1) < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                }
            }else {
                break;
            }
        }
        return flag ? (int)ret * -1 : (int)ret;
    }


    public static boolean isPalindrome(String s) {
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') {
                return false;
            }
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        int left = 0;
        int right = str.length()-1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "0P";
        boolean ret = isPalindrome(str);
        System.out.println(ret);
    }


    public int compress(char[] chars) {
        int index = 0; //用来更新chars
        int i = 0; //用来遍历chars
        while (i < chars.length) {
            int sum = 1;
            for (int j = i + 1; j < chars.length; j++) { //找到有几个相等的字符
                if (chars[j] != chars[i]) {
                    break;
                }
                sum++;
            }
            chars[index++] = chars[i];
            if (sum > 1) {
                String s = String.valueOf(sum);
                for (int k = 0; k < s.length(); k++) {
                    chars[index++] = s.charAt(k);
                }
            }
            i += sum;
        }
        return index;
    }


    public int findUnsortedSubarray(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int len = arr.length;
        int start = len;
        int end = 0;
        for(int i = 0; i < len; i++) {
            if(arr[i] != nums[i]) {
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }
        return (end - start > 0) ? end-start+1 : 0;
    }




}
