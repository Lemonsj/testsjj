public class TestDemo {
    public static String toLowerCase1(String str) {
        char[] array = str.toCharArray();
        int i = 0;
        StringBuffer ptr = new StringBuffer();
        for(i = 0; i < str.length(); i++) {
            while(array[i] <= 'Z' && array[i] >= 'A') {
                array[i] += 32;
            }
            ptr.append(array[i]);
        }

        return ptr.toString();
    }
    public static String toLowerCase(String str){
        char[] array = new char[20];
        for(int i = 0 ; i < str.length(); i++) {
            if(str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
                //str.charAt(i) += 32;
                array[i] = str.charAt(i);
            }
        }
        return String.copyValueOf(array);
    }
    public static void func(int[] nums, int left, int right) {
        while(left <= right) {
            int tmp = 0;
            tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int left = 0;
        int right = 0;
        if(k > nums.length-1 ){
            while(k > 0) {
                left = 0;
                right =  nums.length-1;
                func(nums, left, right);
                k--;
            }
            return;
        }

        right = nums.length-1;
        func(nums, left, right);
        left = k;
        func(nums, left, right);
        left = 0;
        right = k-1;
        func(nums, left, right);
    }
    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 3;
        rotate(nums, k);
        for (int x: nums) {
            System.out.print(x + " ");
        }

    }
    public static void main2(String[] args) {
        String str = "AABBCCDD";
        String ptr = toLowerCase(str);
        System.out.println(ptr);
    }
    public static void main1(String[] args) {
        int x = 20;
        int y = 5;
        System.out.println(x+y + "" +(x+y) + y);
    }
}
