import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-11
 * Time: 15:18
 **/
public class Test {

    public String name = "abc";

    public static void main(String[] args) {
        Test test = new Test();
        Test testB = new Test();
        System.out.println(test.equals(testB) + " ," +test.name.equals(testB.name));
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            int start = 0;
            ArrayList<int[]> result = new ArrayList<>();
            Permutation(array,0,n,result);
            Set<String> sortResult = new TreeSet<String>();
            for(int[] out : result) {
                if(isLegal(array,out,n)) {
                    StringBuffer sb = new StringBuffer();
                    for(int i = 0; i < n-1; i++) {
                        sb.append(out[i] + " ");
                    }
                    sb.append(out[n-1]);
                    sortResult.add(sb.toString());
                }
            }
            for(String list : sortResult) {
                System.out.println(list);
            }
        }
    }

    //求出所有排列
    private static void Permutation(int[] array,int start,int n, ArrayList<int[]> result) {
        if(start == n) {
            return;
        }
        if(start == n-1) {
            int[] B = array.clone();
            result.add(B);
        }

        for(int i = start; i < n; i++) {
            swap(array,start,i);
            Permutation(array,start+1,n,result);
            swap(array,start,i);
        }
    }

    private static boolean isLegal(int[] in, int[] out, int n) {
        LinkedList<Integer> stack = new LinkedList<>();
        int i = 0;
        int j = 0;
        while(i < n) {
            if(in[i] == out[j]) {
                    i++;
                    j++;
            }else{
                if(stack.isEmpty()) {
                    stack.push(in[i]);
                    i++;
                }else {
                    int top = stack.peek();
                    if(top == out[j]) {
                        j++;
                        stack.pop();
                    }else if(i < n) {
                        stack.push(in[i]);
                        i++;
                    }
                }
            }
        }
        while(!stack.isEmpty() && j < n) {
            int top = stack.pop();
            if(top == out[j]) {
                j++;
            }else{
                return false;
            }
        }
        return true;

    }

    private static void swap(int[] array,int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
