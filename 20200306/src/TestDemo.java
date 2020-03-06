class Base {
    //public String name;
    /*Base(String name) {
        this.name = name;
        System.out.println("Base");
    }*/
    Base(){
        System.out.println("Base");
    }
}
//类会自动生成不带参数的构造方法；
//子类中所有的构造函数都会默认访问父类中的空参数构造函数,
// 这是因为子类的构造函数内第一行都有默认的super()语句。
/*public class TestDemo extends Base {
    *//*public TestDemo(String name) {
        super(name);
    }*//*
    public static void main(String[] args) {
        new TestDemo();
        new Base();
    }
}*/

abstract class pop{
    public abstract int add(int x,int y);
}
abstract class ioi{};
class func{
    public static void hello() {
        System.out.println("hello");
    }
}
class person{
    String name;
    public static void fun(){
        System.out.println("person::");
    }
    public static void func() {
        //static int a = 10;
        fun();
    }
}
public class TestDemo{
    public static void main2(String[] args) {
        //func a = new func();
        func a = null;
        a.hello();
        //func.hello();
    }

    public static int a = 10;
    public static void main(String[] args) {
        //int a = a+10;
        int a = 10;
    }
}
