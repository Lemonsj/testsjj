import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-04-16
 * Time: 14:24
 **/
public class Demo {
    public static void main(String[] args) {
        int[] array = {1,4,2,6,3,7,5};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
    //快排
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }
    public static void quick(int[] array,int left,int right) {
        if(left < right){
            int index = findIndex(array,left,right);
            if(index == -1) {
                return;
            }
            quick(array,left,index-1);
            quick(array,index+1,right);
        }
    }

    private static int findIndex(int[] array, int left, int right) {
        int tmp = array[left];
        int i = left;
        int j = right;
        /*while(i < j) {
            while(i < j) {
                if(array[j] >= tmp) {
                    j--;
                }
            }

            while(i < j) {
                if(array[i] <= tmp) {
                    i++;
                }
            }
            swap(array,i,j);
        }*/
        while(i < j) {

            while(i < j && array[j] >= tmp) {
                j--;
            }

            while(i < j && array[i] <= tmp) {
                i++;
            }
            swap(array,i,j);
        }
        swap(array,left,i);
        return i;
    }

    private static void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
