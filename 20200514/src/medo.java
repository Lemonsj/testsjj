/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-14
 * Time: 21:32
 **/

class person{
    public void walk(){
        System.out.println("person is walking");
    }
    public void read(){
        System.out.println("person is reading");
    }
}
class student extends person{
    public void walk(String name) {
        System.out.println("student is walking");
    }
    public void read(){
        System.out.println("student is reading");
    }
}
public class medo {
    public static void main(String[] args) {
        /*student stu = new student();
        stu.read();*/
        person per = new student();
        //per.read();
        per.walk();
    }
}
