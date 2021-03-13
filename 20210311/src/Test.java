import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-11
 * Time: 17:17
 **/
public class Test {
    public static void main(String[] args) {
        List<Integer> lt = new ArrayList<Integer>();
        lt.
    }

    /*public ArrayList<Integer> TopK(int [] array, int k) {
        if(k <= 0 || k > array.length) {
            return null;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for(int i = 0; i < array.length; i++) {
            if(k > 0) {
                queue.offer(array[i]);
                k--;
            }else {
                if(array[i] > queue.peek()) {
                    int tmp = array[i];
                    array[i] = queue.poll();
                    queue.offer(array[i]);
                }
            }
        }

    }*/



}
