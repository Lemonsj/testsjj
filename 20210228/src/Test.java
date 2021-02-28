import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-02-28
 * Time: 20:28
 **/
public class Test {
    public int[] plusOne(int[] digits) {
        if(digits.length == 1 && digits[0] == 0 ) {
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            return arr;
        }
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] == 9) {
                digits[i] = 0;
            }else {
                digits[i] = digits[i] + 1;
                break;
            }
        }

        return digits;
    }

    public int thirdMax(int[] nums) {
        int ret = 0;
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        if(list.size() < 3){
            ret = list.get(list.size()-1);
        }else{
            ret = list.get((list.size()-3));
        }
        return ret;
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ret = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return ret;
    }

    public String addBinary(String a, String b) {
        int m = a.length(), n = b.length();
        if(m < n) return addBinary(b,a);
        int carry = 0,j = n-1;
        StringBuilder sb = new StringBuilder();
        for(int i=m-1;i>-1;i--){
            if(a.charAt(i) == '1') ++carry;
            if(j > -1 && b.charAt(j--) == '1') ++carry;
            sb.append(carry % 2 == 1 ? "1" : "0");
            carry /= 2;
        }
        if(carry > 0) sb.append("1");
        sb.reverse();
        return sb.toString();
    }
}
