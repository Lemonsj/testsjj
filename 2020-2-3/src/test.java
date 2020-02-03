import java.util.Scanner;

public class test {
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        nums = new int[count];
        return count;

    }
    public static int searchInsert(int[] nums, int target) {
        if(nums[0] > target || (nums.length == 0)){
            return 0;
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
            if(target > nums[i] && target < nums[i+1] && (i+1 < nums.length)){
                return i+1;
            }
        }
        return nums.length;
    }

    public static void main1(String[] args) {
        /*int [] nums = {3,2,3,4,5,3};
        int val = 3;
        removeElement(nums, val);*/
        int[] nums = {1,3,5,7,9};
        //int target  = 0;
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        System.out.println(searchInsert(nums, target));
    }

    public static void main(String[] args) {
        int i = 7;
        do {
            System.out.println(--i);
            --i;
        }while(i != 0);
        System.out.println(i);
    }
}
