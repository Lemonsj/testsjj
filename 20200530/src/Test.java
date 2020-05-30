import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-30
 * Time: 17:45
 **/
public class Test {

    public static void main(String[] args) {

    }


    //给定一个非负整数numRows，生成杨辉三角的前numRows行
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        if(numRows == 0) {
            return ret;
        }

        ret.add(new ArrayList<>());



        ret.get(0).add(1);//第一行的第一个数据
        for (int i = 1; i < numRows ; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);

            List<Integer> prevRow = ret.get(i-1);
            for (int j = 1; j < i; j++) {
                //公式
                int num = prevRow.get(j)+prevRow.get(j-1);
                curRow.add(num);

            }
            curRow.add(1);
            ret.add(curRow);

        }




        return ret;
    }
}
