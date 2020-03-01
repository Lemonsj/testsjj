package Why;

public class case1 {
    static final int COUNT = 10;
    static final long NUMBER = 10_0000_0000;

    static long sum() {
        long r = 0;
        for(long i = 0; i < NUMBER; i++) {
            r += i;
        }
        return r;
    }

    static void 单线程() {

        long b = System.nanoTime();

        for(int i = 0; i < COUNT; i++) {
            System.out.println(sum());
        }

        long e = System.nanoTime();

        double s = (e-b)/1000_000_000.0;

        System.out.printf("单线程，运行时间：%f%n",s);
    }
}
