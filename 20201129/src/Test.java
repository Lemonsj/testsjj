import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-29
 * Time: 12:36
 **/
public class Test {
    public static void main1(String[] args) {
        int numRows = 5;
        List<List<Integer>> ret = generate(numRows);
        System.out.println(ret);
    }



    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        ret.add(new ArrayList<>());
        ret.get(0).add(1);

        for(int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);

            List<Integer> prevRow = ret.get(i-1);
            for(int j = 1; j < i; j++) {
                int num = prevRow.get(j) + prevRow.get(j-1);
                curRow.add(num);
            }
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }


    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> ret = getRow(rowIndex);
        System.out.println(ret);
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<>();
        return ret;
    }
}
