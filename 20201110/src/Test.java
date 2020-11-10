/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-10
 * Time: 16:27
 **/
public class Test {
    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
        int ret = minNumberInRotateArray(array);
        System.out.println(ret);
    }
    public static int minNumberInRotateArray(int [] array) {
        if(array.length == 0) {
            return 0;
        }

        int left = 0;
        int right = array.length-1;
        int mid = left;

        while(array[left] >= array[right]) {
            if(right - left == 1) {
                break;
            }
            mid = left + (right-left)/2;
            if(array[mid] >= array[left]) {
                left = mid;
            }else if(array[mid] <= array[right]) {
                right = mid;
            }
        }
        return array[mid];
    }
}
