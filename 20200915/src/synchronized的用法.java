/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-15
 * Time: 17:07
 **/
public class synchronized的用法 {

    public synchronized static void staticMethod() {

    }
    public synchronized void method() {

    }

    //作为代码块--同步代码
    public void someMethod() {
        Object o = new Object();
        synchronized (o) {

        }
    }

}
