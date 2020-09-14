/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-14
 * Time: 21:36
 **/
public class 演示枚举的使用 {
    enum Sex {
        男,女;
    }
    static class Person {
        String name;
        Sex sex = Sex.女;
    }

    public static void main(String[] args) {
        Sex[] values = Sex.values();
        for(Sex sex : values) {
            System.out.println(sex);
        }
    }
}
