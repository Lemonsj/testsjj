package timer;

//import sun.security.mscapi.KeyStore;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-18
 * Time: 18:21
 **/
public class 共享定时器 {

    private static Timer timer = new Timer();

    private static class MyThread extends Thread {

        @Override
        public void run() {
            timer.schedule(new TimerTask() {

                @Override
                public void run() {
                    System.out.println("随便什么");
                }
            },10*1000);
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}
