class T{
    private int count = 10;
    private Object o = new Object();
    public void m() {
        synchronized(o) { //任何线程要执行下面的代码，必须先拿到o的锁
            count--;
            System.out.println(Thread.currentThread().getName() +
                    " count = " + count);
        }
    }
}
public class test1 {
    public static int func(int n) {
        int count = 0;
        int tmp = 0;

        while(n > 1) {
            tmp = n/3;
            n= n/3 + n%3;
            count += tmp;
            if(n == 2) {
                n++;
            }
        }
        return count;
    }
    public static void main1(String[] args) {
        /*T t = new T();
        t.m();*/

        int x = 10;
        System.out.println(func(x));
    }

    public class Test {
        public int aMethod(){
            static int i = 0;
            i++;
            return i;
        }
        public static void main(String args[]){
            Test test = new Test();
            test.aMethod();
            int j = test.aMethod();
            System.out.println(j);
        }
    }
}
