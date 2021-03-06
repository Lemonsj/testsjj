import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-14
 * Time: 22:09
 **/
public class 观察线程状态的变化 {
    private static class AThread extends Thread{

        @Override
        public void run() {
            try{
                for(int i = 0; i < 3; i++) {
                    System.out.println("工作中");
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AThread a = new AThread();
        System.out.println(a.getState());
        a.start();
        System.out.println(a.getState());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(a.getState());
        TimeUnit.SECONDS.sleep(2);
        System.out.println(a.getState());

    }
}
