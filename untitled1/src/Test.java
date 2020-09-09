/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-09
 * Time: 21:10
 **/


class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" run方法正在执行");
    }
}

class MyRunable implements  Runnable{

    @Override
    public void run() {
        System.out.println(" MyRunable方法正在执行");
    }
}

class Mythread extends Thread{
    public Mythread(){

    }

    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread()+":"+i);
        }
    }



}
public class Test {
//    public static void main1(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//    }
//
//    public static void main(String[] args) {
//        MyRunable myRunable = new MyRunable();
//        Thread thread = new Thread(myRunable);
//        thread.start();
//    }

    public static void main(String[] args) {
        Mythread mythread1 = new Mythread();
        Mythread mythread2 = new Mythread();
        Mythread mythread3 = new Mythread();
        mythread1.start();
        mythread2.start();
        mythread3.start();
    }
}
