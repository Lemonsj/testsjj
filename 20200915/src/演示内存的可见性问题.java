import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-15
 * Time: 15:52
 **/
public class 演示内存的可见性问题 {
    private static boolean running = true;

    private static class 子线程 extends Thread{

        @Override
        public void run() {
            int n = 0;
            while(running) {
                n++;
            }

            System.out.println(n);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new 子线程();
        t.start();

        Scanner scan = new Scanner(System.in);
        System.out.println("随便输入什么，让子线程停止");
        scan.nextLine();

        System.out.println(running);

        running = false;

        System.out.println(running);
        while(true) {
            System.out.println(t.getState());
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
