package come;
abstract class Animal {
    abstract void growl();
}

public class Test {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = nums.length-1; j > i; j--) {
                if(nums[i] + nums[j] == target) {
                    int[] ret = new int[] {i, j};
                    return ret;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums, target);
    }
}
