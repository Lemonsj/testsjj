import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-31
 * Time: 13:59
 **/
public class Test {
    public static void main(String[] args) {
        int[] array = {1,3,5,2,6,4,7,9,8};
        /*insert(array);
        System.out.println(Arrays.toString(array));*/

        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

    //直接插入排序
    private static void insert(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j= 0;
            for(j = i-1; j >= 0; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }


    public static void shell(int[] array, int gap) {
        for(int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = 0;
            for(j = i-gap; j >= 0; j-= gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    public static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for(int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }
    }
}

