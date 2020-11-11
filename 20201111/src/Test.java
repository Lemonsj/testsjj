import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-11
 * Time: 20:25
 **/
public class Test {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList();
        if(matrix[0].length == 0 || matrix.length == 0) {
            return list;
        }
        int left = 0;
        int right = matrix[0].length-1;

        int up = 0;
        int down = matrix.length-1;
        while (true) {
            if(left > right) {
                return list;
            }
            for(int i = left; i <= right; i++) {
                list.add(matrix[up][i]);
            }
            up++;

            if(up > down) {
                return list;
            }
            for(int i = up; i <= down; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if(left > right) {
                return list;
            }
            for(int i = right; i >= left; i--) {
                list.add(matrix[down][i]);
            }
            down--;

            if(up > down) {
                return list;
            }
            for(int i = down; i >= up; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
    }

    public String PrintMinNumber(int [] numbers) {
        if(numbers==null || numbers.length<=0)
            return "";
        ArrayList<String> list = new ArrayList<String>();
        for(int number:numbers)
            list.add(String.valueOf(number));
        Collections.sort(list,new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                String a=s1+s2;
                String b=s2+s1;
                return a.compareTo(b);
            }
        });
        StringBuilder sb= new StringBuilder();
        for(String str:list)
            sb.append(str);
        return sb.toString();
    }
}
