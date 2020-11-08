import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-08
 * Time: 15:14
 **/
public class Test {


    public static void reOrderArray1(int [] array) {
        int left = 0;
        int right = array.length-1;
        int tmp = 0;
        while(left < right) {
            while(left < right) {
                if(array[left]%2 != 0){
                    left++;
                    break;
                }else {
                    break;
                }
            }
            while(left < right) {
                if(array[right]%2 == 0){
                    right--;
                    break;
                }else {
                    break;
                }
            }
            if(left < right) {
                tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }
    }

    /*public static void reOrderArray(int [] array) {

        //1 2 3 4 5 6 7
        int[] ptr = new int[array.length];
        int j = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i]%2 != 0) {
                ptr[j] = array[i];
            }
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] %2 == 0) {
                ptr[j] = array[i];
            }
        }
        array = Arrays.copyOf(ptr,ptr.length);

    }*/

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reOrderArray(int [] array) {

        //1 2 3 4 5 6 7
        int[] ptr = new int[array.length];
        int j = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i]%2 != 0) {
                ptr[j] = array[i];
                j++;
            }
        }
        for(int i = 0; i < array.length; i++) {
            if(array[i] %2 == 0) {
                ptr[j] = array[i];
                j++;
            }
        }
        for(int i = 0; i < array.length; i++) {
            array[i] = ptr[i];
        }

    }
}
