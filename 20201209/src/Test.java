import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-09
 * Time: 11:33
 **/
class A{
    public A(String str) {

    }
}
public class Test {
    public static void main(String[] args) {
        A classa = new A("he");
        A classb = new A("he");
        System.out.println(classa == classb);
    }
    //饥饿的小易
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x0=sc.nextLong();
        long m=1000000007;//取模的值
        long s=10000;//神秘力量使用次数
        long[] begin=new long[3];//f(x) = 4x+3 执行3次
//         只要摸为0 就代表可以取到
        //3次的取值
        begin[0]=x0;
        begin[1]=(4*begin[0]+3)%m;
        begin[2]=(4*begin[1]+3)%m;

        long minStep = s;
        long cur = 0;
        int step = 0; //执行的步数

        for (int i = 0; i < 3; i++) {
            cur=begin[i];
            step=i;
            while(cur!=0&&step<minStep){
                cur=(8*cur+7)%m;//g(x) = 8x+7 执行
                step++;
            }
            minStep=step>minStep?minStep:step;
        }
        if (minStep < s) { //如果执行步长没有超过s输出最小步长
            System.out.println(minStep);
        } else {//超过返回-1
            System.out.println(-1);
        }
    }

    public int addAB(int A, int B) {
        // write code here
        if(B != 0) {
            int a = A^B;//求和
            int b = (A&B)<<1;//求进位
            return addAB(a,b);
        }else {
            return A;
        }
    }

}
