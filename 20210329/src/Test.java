import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-29
 * Time: 18:44
 **/
public class Test {
    public static void main(String[] args) {
        int[] array = {1,3,7,10,5,2,8,9,4,6};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    //直接插入排序
    public static void insertSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j =i-1;
            for(; j >= 0; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    //希尔排序
    public static void shellSort(int[] array) {
        int[] gap = {5,3,1};
        for(int i = 0; i < gap.length; i++) {
            shell(array,gap[i]);
        }
    }
    public static void shell(int[] array,int gap) {
        for(int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = i-gap;
            for(; j >= 0; j-= gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }

    //选择排序
    public static void selectSort(int[] array) {

        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {

                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }


    //冒泡排序
    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            boolean flag = true;
            for(int j = 0; j < array.length-1; j++) {
                if(array[j] > array[j+1]) {
                    flag = false;
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
            if(flag) {
                return;
            }
        }
    }

    //快排
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

    private static void quick(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }

        int poilt = partition(array,left,right);
        quick(array,left,poilt-1);
        quick(array,poilt+1,right);
    }

    private static int partition(int[] array, int left, int right) {
        int i = left;
        int j = right;

        int tmp = array[i];
        while(i < j) {
            while(i < j && array[j] >= tmp) {
                j--;
            }
            while(i < j && array[i] <= tmp) {
                i++;
            }
            swap(array,i,j);
        }
        swap(array,i,left);
        return i;
    }

    private static void swap(int[] array, int i, int left) {
        int tmp = array[i];
        array[i] = array[left];
        array[left] = tmp;
    }

    //堆排
    public static void heapSort(int[] array) {
        createHeap(array);
        int end = array.length-1;
        while(end > 0) {
            swap(array,0,end);
            adjustDown(array,0,end);
            end--;
        }
    }

    private static void createHeap(int[] array) {
        for(int i = (array.length-2)/2; i >= 0 ; i--) {
            adjustDown(array,i,array.length);
        }
    }

    public static void adjustDown(int[] array,int root,int len) {
        int parent = root;
        int child = 2*parent + 1;

        while(child < len) {
            if((child+1 < len) && array[child] < array[child+1]) {
                child = child+1;
            }
            if(array[child] > array[parent]) {
                swap(array,parent,child);
                parent = child;
                child = 2*parent + 1;
            }else {
                break;
            }
        }
    }

    public int singleNumber(int[] nums) {
        int ret = nums[0];
        for(int i = 1; i < nums.length; i++) {
            ret ^= nums[i];
        }
        return ret;
    }
}
