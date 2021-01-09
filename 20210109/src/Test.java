import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-09
 * Time: 22:33
 **/
public class Test {
    public static void main(String[] args) {

    }

    /*public static List<List<Integer>> findContinuesSequence(int[] array, int s) {
        // 和为s的两个数，所以数组长度最小也得是2
        if (array == null || array.length < 2) {
            return null;
        }
        // 保存结果
        List<List<Integer>> result = Test.newArrayList();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == s) {
                    result.add(Test.newArrayList(array[i], array[j]));
                }
            }
        }
        return result;
    }*/


    /*public static List<List<Integer>> findContinuesSequence(int[] array, int s) {
        // 和为s的两个数，所以数组长度最小也得是2
        if (array == null || array.length < 2) {
            return null;
        }
        // 初始化两个指针，一个指向数组的开始位置，一个指向数组的结束位置
        int start = 0;
        int end = array.length - 1;
        // 保存结果
        List<List<Integer>> result = Test.newArrayList();
        while (start < end) {
            int sum = array[start] + array[end];
            // 如果两个数字的和等于目标值，则记录，同时将end向前移动（将start向后移动也可以，本质都是为了下一次搜索）
            // 如果和小于目标值，向后移动start，因为end是向前移动的，而数组是递增的，向前移动只会更小
            // 如果和大于目标值，向前移动end，因为递增，所以该操作等于减去两个元素之间的差值
            if (sum == s) {
                result.add(Test.newArrayList(array[start], array[end]));
                //start++;
                end--;
            } else if (sum < s) {
                start++;
            } else {
                end--;
            }
        }
        return result;

    }*/
}
