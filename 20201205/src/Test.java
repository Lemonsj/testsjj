import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-05
 * Time: 22:08
 **/
public class Test {
    public static int[] exchangeAB(int[] AB) {
        AB[0] = AB[0] ^ AB[1];
        AB[1] = AB[0] ^ AB[1];
        AB[0] = AB[0] ^ AB[1];
        return AB;
    }
    public static void main(String[] args) {
        /*public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0] + AB[1];
        AB[1] = AB[0] - AB[1];
        AB[0] = AB[0] - AB[1];
        return AB;
        }*/


    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = (int)Math.pow(2, n);//根据输入的整数，计算出此Gray序列大小
        String[] s1 = {"0","1"};//第一个Gray序列
        for(int i=2;i<=n;i++){//循环根据第一个Gray序列，来一个一个的求
            int p = (int)Math.pow(2, i);//到了第几个的时候，来计算出此Gray序列大小
            String[] si = new String[p];
            for(int j=0;j<p;j++){//循环根据某个Gray序列，来一个一个的求此序列
                if(j<(p/2)){
                    si[j] = "0" + s1[j];//原始序列前面加上"0"
                }else{
                    si[j] = "1" + s1[p-j-1];//原始序列反序，前面加上"1"
                }
            }
            s1 = si;//把求得的si，附给s1,以便求下一个Gray序列
        }
        for(int i=0;i<num;i++){
            System.out.println(s1[i]);
        }
    }

    public String[] getGray(int n) {
        // write code here
        if(n == 1) {
            return new String[] {"0","1"};
        }else{
            String[] tmp = getGray(n-1);
            String[] result = new String[tmp.length*2];
            for(int i = 0; i < tmp.length; i++) {
                result[i] = "0" + tmp[i];
            }
            int i;
            int j;

            for(i = 0, j = tmp.length-1; i < tmp.length && j >= 0; i++, j--) {
                result[i + tmp.length] = "1" + tmp[j];

            }

            return result;
        }
    }
}
