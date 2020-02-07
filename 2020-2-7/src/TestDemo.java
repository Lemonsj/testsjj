import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo {
    public static int[] sortArrayByParity(int[] A) {
        if(A == null || A.length == 1) {
            return A;
        }
        int left = 0;
        int right = A.length-1;
        while(left < right) {
            if(A[left]%2 == 0) {
                left++;
            }
            if(A[right]%2 != 0) {
                right--;
            }
            if(A[right]%2 == 0 && A[left]%2 != 0) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
            }

        }
        return A;
    }

    public static int pivotIndex(int[] nums) {
        if(nums.length < 2) {
            return -1;
        }
        int sum = 0;
        int sumleft = 0;
        int sumright = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                sumleft = 0;
            }else {
                sumleft += nums[i-1];
            }
            sumright = sum - sumleft - nums[i];
            if(sumleft == sumright) {
                return i;
            }
        }
        return -1;
    }

    /*public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--) {
            if(digits[i] != 9) {
                digits[i] += 1;
                break;
            }else {
                digits[i] = 0;
            }
        }
        return digits;
    }*/
    public static int[] plusOne1(int[] digits) {
        boolean flag = false;
        for(int i : digits){
            if(i!=9) {flag = true; break;}
        }
        if(flag == false){
            int[] res = new int[digits.length+1];
            res[0]=1;
            return res;
        }
        else{
            for(int i = digits.length - 1;i>=0;i--){
                if(digits[i]!=9){
                    digits[i]+=1;
                    break;
                }
                else{
                    digits[i]=0;
                }
            }
            return digits;
        }
    }
    public static int[] plusOne(int[] digits) {
        boolean flag = false;
        for(int i = 0; i < digits.length; i++) {
            if(digits[i] != 9) {
                flag = true;
                break;
            }
        }
        if(flag == false) {
            int[] ret = new int[digits.length+1];
            ret[0] = 1;
            return ret;
        }else {
            for(int i = digits.length-1; i >= 0; i--) {
                if(digits[i] != 9) {
                    digits[i] += 1;
                    break;
                }else {
                    digits[i] = 0;
                }
            }
            return digits;
        }

    }

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = nums.length-1; i >= 0; i--) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
            }
            if(list.size() == 3) {
                return list.get(2);
            }
        }
        return nums[nums.length-1];

    }
    public static void main(String[] args) {
        int[] array = {9,8};
        plusOne(array);
    }
    public static void main2(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        pivotIndex(nums);
    }
    public static void main1(String[] args) {
        int[] array = {3,1,2,4};
        System.out.println(sortArrayByParity(array));

    }
}
