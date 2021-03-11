import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-09
 * Time: 21:40
 **/
public class Sort {
    public static void main(String[] args) {
        int[] array = {3,4,2,5,1,7,6,8};
        //System.out.println(Arrays.toString(insertSort(array)));
        //System.out.println(Arrays.toString(shellSort(array)));
        //System.out.println(Arrays.toString(bubbleSort(array)));
        //System.out.println(Arrays.toString(selectSort(array)));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void main2(String[] args) {
        int[] array = {3,4,2,5,1,7,6,8};
        int ret = binarySearch(array,2);
        System.out.println(ret);
    }

    //二分查找
    public static int Search(int[] array,int k) {
        int left = 0;
        int right = array.length-1;

        while(left <= right) {
            int mid = (right+left)/2;
            if(array[mid] == k) {
                return mid;
            }else if(array[mid] > k) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[], int target) {
        //开始和结束索引
        int left = 0;
        int right = arr.length - 1;
        //循环
        while (left <= right) {
            //获取中间索引
            int middle = (left + right) / 2;
            //比较中间索引的元素和target
            if (arr[middle] == target) {
                return middle;// key found
            } else if (arr[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;//key not found，则返回-1
        //return -(left + 1);;//注意：Arrays类中返回的是(length+1)或-(endIndex+1)
    }

    //时间复杂度：O(n^2);  空间复杂度：O(1)
    public static int[] insertSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int  j = 0;
            for(j = i-1; j >= 0; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
        return array;
    }


    public static void shell(int[] array,int gap) {
        for(int i = gap; i < array.length; i+= gap) {
            int tmp = array[i];
            int j = 0;
            for(j = i-gap; j >= 0; j--) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }
    //时间复杂度：O(n^2);  空间复杂度：O(1)
    public static int[] shellSort(int[] array) {
        int[] gap = {5,3,1};
        for(int i = 0; i < gap.length; i++) {
            shell(array,gap[i]);
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            boolean flag = true;
            for(int j = 0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag) {
                break;
            }
        }
        return array;
    }


    public static int[] selectSort(int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j< array.length; j++){
                if(array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    /*
    * 快排：时间复杂度：O(nlogn);  空间复杂度：O(logn)  不稳定
    * */


    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

    public static void quick(int[] array,int left,int right) {
        if(left == right) {
            return;
        }
        if(left > right) {
            return;
        }

        int index = partition(array,left,right);
        quick(array,left,index-1);
        quick(array,index+1,right);
    }

    public static int partition(int[] array,int left,int right) {
        int i = left;
        int j = right;

        int tmp = array[left];
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

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


    /*
    * 堆排：时间复杂度：    空间复杂度：          稳定性：
    * */

    public static void heapSort(int[] array) {
        createHeap(array);
        int end = array.length-1;
        while(end > 0) {
            swap(array,0,end);
            adjustDown(array,0,end);
            end--;
        }
    }


    public static void createHeap(int[] array) {
        for(int i = (array.length-1-1)/2; i >= 0; i--) {
            adjustDown(array,i,array.length);
        }
    }




    public static void adjustDown(int[] array, int root,int len) {
        int parent = root;
        int child = 2*parent +1;

        while(child < len) {
            if((child +1 < len) && array[child] < array[child +1]) {
                child++;
            }

            if(array[child] > array[parent]) {
                swap(array,child,parent);
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }


}
