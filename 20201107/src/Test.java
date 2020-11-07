/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-07
 * Time: 12:32
 **/
public class Test {

    public static void main1(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        System.out.println(array.length);
        System.out.println(array[0].length);
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

    /*public ListNode ReverseList(ListNode head) {
        //ListNode node = new ListNode();
        ListNode prev = null;
        ListNode curNext;
        if(head == null || head.next == null) {
            return head;
        }
        while(head != null) {
            curNext = head.next;
            head.next = prev;
            prev = head;
            head = curNext;
        }
        return prev;
    }*/




    public static void reOrderArray(int [] array) {
        int left = 0;
        int right = array.length-1;
        int tmp = 0;
        while(left < right) {
            while(left < right) {
                if(array[left]%2 != 0){
                    left++;
                    break;
                }
            }
            while(left < right) {
                if(array[right]%2 == 0){
                    right--;
                    break;
                }
            }
            tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,4,2,5,6,9,3};
        reOrderArray(array);
        System.out.println(array.toString());
    }
}
