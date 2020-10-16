import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-16
 * Time: 16:01
 **/
public class Test {

    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"-》"+pos2+" ");
    }

    public static void haino(int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
        }else {
            haino(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            haino(n-1,pos2,pos1,pos3);
        }
    }
    public static void main1(String[] args) {
        haino(1,'A','B','C');
        System.out.println();
        haino(2,'A','B','C');
        System.out.println();
        haino(3,'A','B','C');
    }

    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] ret = copyArray(array);
        System.out.println(Arrays.toString(ret));
    }

    private static int[] copyArray(int[] array) {
        int[] tmp = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        return tmp;
    }

    public static int findMax(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static int maxArray(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    public static void main3(String[] args) {
        int[] array = {12,2,18,24,76,13};
        int max = findMax(array);
        System.out.println(max);
    }

    public static int find(int[] array,int key) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == key) {
                return i;
            }
        }
        return -1;
    }


    public static void main4(String[] args) {
        int[] array = {12,2,18,24,76,13};
        int ret = find(array,24);
        System.out.println(ret);
    }


    //二分查找/折半查找

    public static int binarySearch(int[] array, int key) {
        int left = array[0];
        int right = array[array.length-1];
        int ret = 0;
        for(int i = 0; i < array.length; i++) {
            int mid = left + (right-left)/2;
            //int mid = (left + right)>>>1;
            if(array[mid] > key) {
                right = mid-1;
            }else if(array[mid] < key) {
                left = mid+1;
            }else {
                ret = mid;
            }
        }
        return ret;
    }

    public static void main5(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
          int ret = binarySearch(array,8);
        System.out.println(ret);
    }

    public static void main6(String[] args) {
        int[] array = {1,4,2,6,8,3,10,9};
        int[] ret = bubbleSort(array);
        System.out.println(Arrays.toString(ret));
    }

    private static int[] bubbleSort(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for(int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }

            //优化
            //判断这一趟走完后，是否有序
            if(flag == false) {
                break;
            }

        }
        return array;
    }


    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,4,2,6,8,3,10,9};
        //reverse(array);
        func(array);
        System.out.println(Arrays.toString(array));
    }

    public static void func(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            while(left < right && array[left]%2 == 0) {
                left++;
            }
            while(left < right && array[right]%2 != 0) {
                right--;
            }
            if(left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }

}
