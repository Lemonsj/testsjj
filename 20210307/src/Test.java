import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-07
 * Time: 21:21
 **/
public class Test {
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            int len = str.length();
            int i = 0;
            int t = 0;
            String ret = "";
            while(i <= len) {
                if(str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                    t = i;
                    while(str.charAt(i) >= '1' && str.charAt(i) <= '9') {
                        i++;
                    }
                    int a = t-i+1;
                    if(a > ret.length()) {
                        ret = str.substring(t,i);
                    }
                }else {
                    i++;
                }
            }
            for(int j = 0; j < ret.length(); j++) {
                System.out.print(ret.charAt(j));
            }
        }
    }


    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = input.length;
        if(k > length || k == 0){
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                Integer temp = maxHeap.poll();
                temp = null;
                maxHeap.offer(input[i]);
            }
        }
        for (Integer integer : maxHeap) {
            result.add(integer);
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        fun(a,b);
        System.out.println(a+"."+b);
    }

    private static void fun(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}

