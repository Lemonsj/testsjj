/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-11
 * Time: 16:15
 **/
class X{
    Y y = new Y();
    public X() {
        System.out.println("X");
    }
}
class Y{
    public Y() {
        System.out.println("Y");
    }
}
public class Z extends X {
    Y y = new Y();
    public Z() {
        System.out.println("Z");
    }
    public static void main(String[] args) {
        new Z();
    }
}
