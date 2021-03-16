package SingleDemo;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-16
 * Time: 17:39
 **/

/*
* 单例模式--》饿汉模式
* */
public class Starving {
    private static Starving instance = new Starving();

    public static Starving getInstance() {
        return instance;
    }

    private Starving() {

    }



    static class MyThread extends Thread {

        @Override
        public void run() {
            Starving st = Starving.getInstance();
            System.out.println(st);
        }
    }
}
