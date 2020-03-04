import java.util.Scanner;

public class Test {

    //直接插入排序
    //时间复杂度：最坏：O(n^2)   最好：O(n)-->有序的情况下
    //空间复杂度：O(1)
    //稳定性：稳定
    public static void insertSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = 0;
            for(j = i-1; j >= 0; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    //array[j+1] = tmp;前面的序列已经有序
                    break;
                }
            }

            array[j+1] = tmp;
        }
    }


    //希尔排序
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    }

    public static int partion(int[] array,int start,int end) {
        int tmp = array[start];
        while(start < end) {
            while((start < end) && (array[end] >= tmp)) {
                end--;
            }

            if(start >= end) {

                break;
            }else {
                array[start] = array[end];
            }

            while((start < end) && array[start] <= tmp) {
                start++;

            }

            if(start >= end) {

                 break;
            }else {
                array[end] = array[start];
            }
        }
        array[start] = tmp;
        return start;
    }
    public static void quick(int[] array,int low,int high) {
        if(low < high) {
            int pivot = partion(array,low,high);
            quick(array,low,pivot-1);
            quick(array,pivot+1,high);
        }
    }
    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);

    }
}
