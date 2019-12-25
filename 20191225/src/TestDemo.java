import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestDemo {
    public Stack<Integer> stack;

    public Queue<Integer> queue1 = new LinkedList<>();
    public Queue<Integer> queue2 = new LinkedList<>();
    //stack = new Stack<>()
    //直接插入排序
    public static void insertSort(int[] array) {
        int j = 0;
        int tmp = 0;
        for(int i = 1; i < array.length; i++) {
            while(j>=0) {
                tmp = array[i];
                j = i-1;
                if(array[j] < tmp) {
                    break;//前面的序列已经有序
                }else {
                    array[j+1] = array[j];

                }
                j--;
            }
            array[j+1] = tmp;
        }
    }

    //希尔排序
    public static void shell(int[]array, int gap) {
        for (int i = gap; i <array.length ; i++) {
            int j = 0;
            int tmp = array[i];
            for(j = i-gap; j >=0; j-= gap ) {
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
        for(int i = 0; i <drr.length; i++) {
            shell(array,i);
        }
    }

    //选择排序
    public static void selectSort(int[] array) {
        for(int i = 0; i<array.length; i++) {
            for(int j = i+1; j<array.length; j++) {
                if(array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

}
