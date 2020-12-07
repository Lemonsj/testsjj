import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-07
 * Time: 16:50
 **/
public class Test{
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String c = scan.next();
        for(int i = 0; i < n; i+=2) {
            for(int j = 0; j < n; j++) {
                System.out.print(c);

            }
        }
        *//*System.out.println();
        for(int i = 2; i < n; i+=2) {
            for(int j = 0; j <= 2; j+=2) {
                System.out.print(c);
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            System.out.print(c);
        }*//*
    }*/

    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String c = scan.next();
        for(int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
        for(int i = 0; i < Math.ceil((double) n / 2 - 2); i++) {
            System.out.print(c);
            for(int j = 1; j <= n-1; j++) {
                System.out.print(" ");
            }
            System.out.println(c);
        }
        for(int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
    //生成n位格雷码
    public String[] getGray(int n) {
        //1 : 0,1
        //2 : 00 01 11 10
        if(n == 1) {
            return new String[]{"0", "1"};
        }else {
            String[] tmp = getGray((n-1));
            String[] ret = new String[tmp.length*2];
            for(int i = 0; i < tmp.length; i++) {
                ret[i] = "0" + tmp[i];
            }

            int i,j;
            for(i = 0, j = tmp.length; i < tmp.length && j >= 0; i++,j--) {
                ret[i+tmp.length] = "1" + tmp[j];
            }
            return ret;
        }
    }


    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String c = scan.next();

        for(int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
        for(int i = 0; i < Math.ceil((double) n / 2 - 2); i++) {
            for(int j = 0; j <= n-1; j++) {
                if(j == 0 || j == n-1) {
                    System.out.print(c);
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();



    }


    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String c = scan.next();
        // Math.round(float)返回最接近的参数 int ，其中 int四舍五入为正无穷大。
        int row = Math.round((float) n / 2); //行
        for(int i = 0; i < row; i++) {
            // 打印第一行和最后一行
            if(i == 0 || i == row - 1) {
                for(int j = 0; j < n; j++) {
                    System.out.print(c);
                }
            } else {  // 打印中间行
                for(int j = 0; j < n; j ++) {
                    // 每行 第一列 和最后一列 打印字母
                    if(j == 0 || j == n - 1) {
                        System.out.print(c);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        String ret = AddLongInteger("11","32");
        System.out.println(ret);
    }

    public static String AddLongInteger(String addend,String augend) {
        int len1 = addend.length();
        int len2 = augend.length();
        int len = len1-len2;
        int num = 0;
        String s = "";
        if(len1 < 0) {
            return augend;
        }
        if(len2 < 0) {
            return addend;
        }
        int i = 0;
        int j = 0;
        for(i = len1-1,j =len2-1 ; i >= 0 && j >= 0; i--,j--) {
            int tmp1 = addend.charAt(i)-48;
            int tmp2 = augend.charAt(j)-48;
            int sum = tmp1+tmp2;
            num = sum/10;//十位
            int tmp = sum%10;//个位
            s = s + (tmp+"");
            if(i == 0) {
                int k = j--;
                while(k >= 0 ){
                    sum = augend.charAt(k)-48 + num;
                    num = sum/10;//十位
                    tmp = sum%10;//个位
                    s = s + (tmp+"");
                    k--;
                    if(num == 0) {
                        break;
                    }
                }
                String ptr = augend.substring(0,k);
                s = s+ptr;

            }else if(j == 0) {
                s = s + addend.charAt(i+1) + (num+ "");
            }
        }
        return s;
    }


    /*public String AddLongInteger(String addend,String augend) {
        BigInteger num1 = new BigInteger(addend);//采用BigInteger可以直接进行大整数进行计算
        BigInteger num2 = new BigInteger(augend);
        return num1.add(num2).toString();
    }*/
}
