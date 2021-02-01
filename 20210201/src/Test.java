import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-02-01
 * Time: 13:59
 **/
public class Test {
    public static void main(String[] args) {
        int[] array = {1,3,5,2,6,4,7,9,8};
        /*insert(array);
        System.out.println(Arrays.toString(array));*/

        //shellSort(array);
        //selectSort(array);
        //heapSort(array);
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    //堆排
    public static void heapSort(int[] array) {
        //创建大根堆
        createHeap(array);
        //堆顶元素和最后一个元素进行交换
        int end = array.length-1;
        while(end > 0){
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }

    private static void adjustDown(int[] array, int root, int len) {
        int parent = root;
        int child = 2*parent+1;

        while(child < len) {
            if((child + 1 < len) && array[child] < array[child + 1]) {
                child++;
            }

            if(array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2*parent + 1;
            }else {
                break;
            }
        }
    }


    private static void createHeap(int[] array) {
        for(int i = (array.length-1-1)/2; i >= 0; i--) {
            adjustDown(array,i,array.length);
        }
    }


    //冒泡排序
    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            for(int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    //选择排序
    public static void selectSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j <array.length; j++) {
                if(array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
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

