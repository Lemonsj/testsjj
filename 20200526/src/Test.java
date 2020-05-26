/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-26
 * Time: 22:14
 **/
class A {
    static {
        System.out.println("A.static {}");
    }

    static int i = initI();

    static int initI() {
        System.out.println("A.initI()");
        return 0;
    }

    A() {
        System.out.println("A()");
    }

    {
        System.out.println("A.{}");
    }
}

class B extends A {
    static {
        System.out.println("B.static {}");
    }

    static int i = initI();

    static int initI() {
        System.out.println("B.initI()");
        return 0;
    }

    B() {
        System.out.println("B()");
    }

    {
        System.out.println("B.{}");
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("start");
        new B();
        new B();
        System.out.println("end");
    }
}
