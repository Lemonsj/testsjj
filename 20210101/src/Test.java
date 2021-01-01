import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-01
 * Time: 23:20
 **/
public class Test {
    public ArrayList<String> permutation(String str) {
        ArrayList<String> ret = new ArrayList<>();

        if (str == null || str.isEmpty()) {
            return ret;
        }

        char[] arr = str.toCharArray();

        permutation(arr, 0, ret);

        Collections.sort(ret);
        return ret;
    }

    private void permutation(char[] arr, int begin, ArrayList<String> cache) {
        if (begin == arr.length - 1) {
            cache.add(new String(arr));
            return;
        }

        int len = arr.length;
        for (int i=begin; i<len; i++) {
            // 与begin不同位置的元素相等，不需要交换
            if (i!=begin && arr[i]==arr[begin]) {
                continue;
            }
            // 交换元素
            swap(arr, begin, i);
            // 处理后续元素
            permutation(arr, begin+1, cache);
            // 数组复原
            swap(arr, begin, i);

        }
    }

    private void swap(char[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        arr[i] = (char)(arr[i]^arr[j]);
        arr[j] = (char)(arr[i]^arr[j]);
        arr[i] = (char)(arr[i]^arr[j]);
    }

    public static void main(String[] args) {

    }
}
