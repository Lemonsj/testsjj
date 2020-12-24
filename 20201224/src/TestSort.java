import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-24
 * Time: 19:40
 **/
public class TestSort {

    public static void insertSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = 0;
            for(j = i-1; j >= 0; j--) {
                if(array[j] >= tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {12,4,6,9,2};
        insertSort(array);
        System.out.println(Arrays.toString(array));

    }
}
