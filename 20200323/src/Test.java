public class Test {
    String str = new String("hello");
    char[] ch = {'a','b'};

    public static void main(String[] args) {
        Test ex = new Test();
        ex.Change(ex.str,ex.ch);
        System.out.println(ex.str+" and");
        System.out.println(ex.ch);
    }
    public static void Change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'c';
    }
    public static void main1(String[] args) {
        int x1 = 0;
        int x2 = 0;
        for(int i = 1; i <= 30; i++) {
            x1 += 10;
            //x2 += Math.pow(2,i-1);
            x2 = 2*x2+1;
        }
        System.out.println(x1+"万元" + " " + x2 + "分");
    }

    public static void operate(StringBuffer x,StringBuffer y) {
        x.append(y);
        y=x;
    }
    public static void main2(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a,b);
        System.out.println(a+"." + b);
    }
}
