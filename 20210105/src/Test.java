import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-05
 * Time: 20:07
 **/
public class Test {

    public static int[] twoSum1 (int[] numbers, int target) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< numbers.length; i++) {
            map.put(numbers[i],i+1);
        }
        int[] ret = new int[2];
        for(int i = 0; i < numbers.length; i++) {
            int tmp = target-numbers[i];
            if(map.containsValue(tmp) && tmp != numbers[i]){
                ret[0] = i+1;
                ret[1] = map.get(tmp);
                if(ret[0] > ret[1]) {
                    int t = ret[0];
                    ret[0] = ret[1];
                    ret[1] = t;
                }
                break;
            }
        }
        return ret;
    }

    public static int[] twoSum (int[] numbers, int target) {
        Map<Integer, Integer> tempArr = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            // 判断在数组tempArr中是否存在target - num[i]这个数
            if (tempArr.containsKey(target - numbers[i])) {
                // 若存在，则返回nums[i]这个数的下标，以及target - nums[i]这个键在tempArr中所对应的值
                return new int[]{tempArr.get(target - numbers[i]), i+1};
            } else {
                // 若不存在，则将nums[i]这个数放入tempArr中
                tempArr.put(numbers[i], i+1);
            }
        }
        throw new IllegalArgumentException("找不到想要的下标值");
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int[] ret = twoSum(arr,6);
        System.out.println(Arrays.toString(ret));
    }
}
