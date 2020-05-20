/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-20
 * Time: 21:35
 **/
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] citys = new int[n][n];
        for(int i = 0; i < n; ++i){
            for(int j = 0; j < n; ++j){
                citys[i][j] = sc.nextInt();
            }
        }

        List<Integer> gone = new LinkedList<>();
        for(int i = 1; i < n; ++i) gone.add(i);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < gone.size(); ++i){
            int temp_int = gone.get(i);
            gone.remove(i);
            min = Math.min(min, fun(temp_int, gone, citys) + citys[0][temp_int]);
            gone.add(i, temp_int);
        }

        System.out.println(min);
    }

    public static int fun(int head, List<Integer> gone, int[][] citys){
        if(gone.size() == 0){
            return citys[head][0];
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < gone.size(); ++i){
            int temp_int = gone.get(i);
            gone.remove(i);
            min = Math.min(min, fun(temp_int, gone, citys) + citys[head][temp_int]);
            gone.add(i, temp_int);
        }

        return min == Integer.MAX_VALUE ? citys[head][0] : min;
    }
}

