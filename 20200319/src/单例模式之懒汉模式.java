/*
public class 单例模式之懒汉模式 {

    private static 单例模式之懒汉模式 instance = null;

    private 单例模式之懒汉模式() { }

    public static 单例模式之懒汉模式 getInstance() {
        if(instance == null) {
            instance = new 单例模式之懒汉模式();
        }
        return instance;
    }

    public static void main(String[] args) {
        单例模式之懒汉模式 ins1 = 单例模式之懒汉模式.getInstance();
        单例模式之懒汉模式 ins2 = 单例模式之懒汉模式.getInstance();
        单例模式之懒汉模式 ins3 = 单例模式之懒汉模式.getInstance();

        System.out.println(ins1 == ins2);
        System.out.println(ins2 == ins3);
    }
}
*/

import java.util.ArrayList;
import java.util.List;

public class 单例模式之懒汉模式 {

    private volatile static 单例模式之懒汉模式 instance = null;

    private 单例模式之懒汉模式() { }
    public static 单例模式之懒汉模式 getInstance() {
        //第一次判断
        if(instance == null) {
            //内部枷锁
            synchronized (单例模式之懒汉模式.class) {
                //二次判断
                if(instance == null) {
                    instance = new 单例模式之懒汉模式();
                }
            }
        }
        return instance;
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            单例模式之懒汉模式 ins1 = 单例模式之懒汉模式.getInstance();
        }
    }

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[10];
        for(int i = 0; i < 10; i++) {
            threads[i] = new MyThread();
        }
        for(int i = 0; i < 10; i++) {
            threads[i].start();
        }
    }
    //List list = new ArrayList<>();
}


