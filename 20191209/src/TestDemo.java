import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) {
            return triangle;
        }
        //第0行
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for(int i = 1; i < numRows; i++) {
            List<Integer>  curRow = new ArrayList<>();
            curRow.add(1);
            List<Integer> prevRow = triangle.get(i-1);
            for(int j = 1; j < i; j++) {
                int tmp = prevRow.get(j-1) + prevRow.get(j);
                curRow.add(tmp);
            }
            curRow.add(1);
            triangle.add(curRow);
        }
        return triangle;

    }
    public static void main5(String[] args) {
        List<List<Integer>> ret = generate(5);

        for (List<Integer> list  : ret) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ret = generate(6);
        for (List<Integer> list: ret) {
            System.out.println(list);
        }
    }


    public static List<Character> func(String str1, String str2) {
        List<Character> ret = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            if(!(str2.contains(str1.charAt(i)+ "" ))){
                ret.add(str1.charAt(i));
            }
        }
        return ret;
    }
}
