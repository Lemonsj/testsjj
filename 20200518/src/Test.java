import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-18
 * Time: 20:54
 **/
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str = scan.nextLine();
            StringBuffer ptr = new StringBuffer(str);
            StringBuffer stp = replaceSpace(ptr);
            System.out.println(stp.toString());
        }
    }

    private static StringBuffer replaceSpace(StringBuffer ptr) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < ptr.length(); i++) {
            char c = ptr.charAt(i);
            if(c != ' '){
                str.append(c);
            }else {
                str.append("%20");
            }
        }
        return str;

    }
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) {
            return 0;
        }
        int low = 0;
        int high = array.length-1;
        int mid = low;
        while(array[low] >= array[high]) {
            if(high-low == 1){
                mid = high;
                break;
            }
            mid = low +(high-low)/2;
            if(array[low] == array[high] && array[mid] == array[low]) {
                return MinInOrder(array,low,high);
            }
            if(array[mid] >= array[low]) {
                low = mid;
            }else if(array[mid] <= array[high]) {
                high = mid;
            }

        }
        return array[mid];

    }

    private int MinInOrder(int[] array, int low, int high) {
        int ret = array[low];
        for(int i = low+1; i < high; i++) {
            if(ret > array[i]) {
                ret = array[i];
            }
        }
        return ret;
    }
}
