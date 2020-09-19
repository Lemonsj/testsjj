package timer;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-18
 * Time: 18:10
 **/
public class Main {
    private static class Task extends MyTimer.MyTimerTask {

        @Override
        public void run() {
            System.out.println("10s已到");
        }//71.2838
    }

    public static void main(String[] args) throws InterruptedException {
        MyTimer timer = new MyTimer();
        timer.schedule(new Task(),10*1000);

        while(true) {
            System.out.println("随便什么，总之我自己做我自己的事");
            TimeUnit.MILLISECONDS.sleep(500);
        }
    }
}
