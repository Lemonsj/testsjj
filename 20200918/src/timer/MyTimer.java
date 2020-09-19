package timer;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-18
 * Time: 18:31
 **/
/*
public class MyTimer {

    static abstract class MyTimerTask {
        abstract  void run();
    }

    void schedule(MyTimerTask task, long delay) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(delay);
                    task.run();
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
*/


public class MyTimer {
    static abstract class MyTimerTask {
        abstract  void run();
    }

    void schedule(MyTimerTask task, long delay) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(delay);
                    task.run();
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
