import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-25
 * Time: 14:36
 **/
public class Test {
    public static ArrayList<Integer> getLeastNumbers(int[] input,int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if(input == null || input.length < k || k <= 0){
            return result;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i < input.length; i++){
            queue.add(input[i]);
        }
        for(int i = 0; i < k; i++) {
            result.add(queue.poll());
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {12,3,2,7,9,24,6};
        ArrayList<Integer> ret = getLeastNumbers(array,4);
        for(int i = 0; i < ret.size(); i++) {
            System.out.print(ret.get(i)+" ");
        }
    }
}
