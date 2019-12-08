import java.util.ArrayList;
import java.util.List;
class Students{
    public String name;
    public String Class;
    public double grade;
    public Students(String name,String Class,double grade){
        this.name = name;
        this.Class = Class;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", Class='" + Class + '\'' +
                ", grade=" + grade +
                '}';
    }
}
public class TestDemo2 {


    //numRows：你的行数
    /*public static List<List<Integer>> generate1(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0) {
            return triangle;
        }
        triangle.add(new ArrayList<>());//0
        triangle.get(0).add(1);
        //行数
        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            //上一行
            List<Integer> prevRow = triangle.get(i-1);
            //第i行的第j列
            for (int j = 1; j < i; j++) {
                int tmp = prevRow.get(j-1)+prevRow.get(j);
                curRow.add(tmp);
            }
            curRow.add(1);
            triangle.add(curRow);
        }
        return triangle;
    }*/

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
    public static void main4(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character> list = func("welcome to bit","come");
        System.out.println(func(str1,str2));
        System.out.println(list);
    }
    public static void main3(String[] args) {
        List<Students> students = new ArrayList<>();
        Students student1 = new Students("mubai","一班",99.8);
        Students student2 = new Students("chenyi","三班",77.8);
        Students student3 = new Students("buyi","二班",88.8);
        students.add(student1);
        //students.add(new Students("mubai","一班",99.9));
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        for (Students student: students) {
            System.out.println(student);
        }
    }
    public static void main2(String[] args) {
        String str = "abcdef";
        String str1 = new String("abcdef");
        if(str == str1) {
            System.out.println("true");
        }
        System.out.println("*********************");
        //System.out.println(str.equals(str1));
    }
    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str.charAt(0));
        char[] array = str.toCharArray();
        System.out.println(String.copyValueOf(array));
        for (char x: array ) {
            System.out.println(x);
        }
    }
}
