import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-14
 * Time: 19:01
 **/
public class 展示Sleep的功能 {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println(start);
        //Thread.sleep(5000);
        TimeUnit.SECONDS.sleep(5);
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end-start);
    }
}
