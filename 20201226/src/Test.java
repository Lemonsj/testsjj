import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-26
 * Time: 20:17
 **/
class TreeNode{

}
public class Test {
    public static void insertSort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int j = 0;
            int tmp = array[i];
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
    public static void main1(String[] args) {
        int[] array = {2,4,1,6,23,7,9,5};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main2(String[] args) {
        int[] array = {12,3,2,7,9,24,6};
        ArrayList<Integer> ret = getLeastNumbers(array,4);
        for(int i = 0; i < ret.size(); i++){
            System.out.print(ret.get(i) + " ");
        }
    }

    private static ArrayList<Integer> getLeastNumbers(int[] array,int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(array == null || array.length < k || k <= 0) {
            return ret;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
        for(int i = 0; i < k; i++) {
            ret.add(queue.poll());
        }
        return ret;
    }
    
    
    public static void adjustDown(int[]array,int k) {
        if(k >= array.length) {
            return;
        }
        int child = k-1;
        int parent = (child-1)/2;
        while(child < k && parent >= 0) {
            if(child + 1 < k && array[child] < array[child+1]) {
                child++;
            }
            int tmp = array[child];
            array[child] = array[parent];
            array[parent] = tmp;
            parent = child;
            child = 2*parent +1;
        }
    }
    //TopK堆排
    public static void main(String[] args) {
        int[] array = {12,3,2,7,9,24,6};
        heapSort(array,4);
        System.out.println(Arrays.toString(array));
    }

    private static void heapSort(int[] array,int k) {
        if(array == null || array.length < k || k <= 0) {
            return;
        }

        adjustDown(array,k);
        for(int i = k; i < array.length; i++) {
            Swap(array,i);
            adjustDown(array,k);
        }
    }

    private static void Swap(int[] array, int i) {
        int tmp = array[0];
        array[0] = array[i];
        array[i] = tmp;
    }



}
