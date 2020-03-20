public class 单例模式之懒汉 {
    private static volatile 单例模式之懒汉 instance = null;
    private 单例模式之懒汉(){}
    public static 单例模式之懒汉 getInstance() {
        if(instance == null) {
            synchronized (单例模式之懒汉.class) {
                if(instance == null) {
                    instance = new 单例模式之懒汉();
                }
            }
        }
        return instance;
    }
    public static class MyThread extends Thread {

        @Override
        public void run() {
            单例模式之懒汉 ins1 = 单例模式之懒汉.getInstance();
            System.out.println(ins1);
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
        /*单例模式之懒汉 ins1 = 单例模式之懒汉.getInstance();
        单例模式之懒汉 ins2 = 单例模式之懒汉.getInstance();
        单例模式之懒汉 ins3 = 单例模式之懒汉.getInstance();

        System.out.println(ins1 == ins2);
        System.out.println(ins2 == ins3);*/
    }
}
