import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-25
 * Time: 18:28
 **/
public class Test {
    private String[] hanArr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private String[] unitArr_Integer={"拾","佰","仟","万"};
    private String[] unitArr_Decimal={"分","角"};
    private String toHanStr_Integer(String numStr) {
        String result = "";
        int len = numStr.length();
        for(int i = 0; i < len; i++) {
            int num = numStr.charAt(i)-48;
            if(i != len-1 && num != 0) {
                result += (hanArr[num] + unitArr_Integer[len-2-i]);
            }else {
                if(hanArr[num].equals("零") && result.substring(result.length()-1,result.length()).equals("零")) {
                    continue;
                }else {
                    result += hanArr[num];
                }
            }
        }
        return result;
    }
    private String toHanStr_Decimal(String numStr) {
        String result="";
        int len = numStr.length();
        for (int i = 0; i < len; i++) {
            int num = numStr.charAt(i) - 48;
            if (i != len && num != 0) {
                result += (hanArr[num] + unitArr_Decimal[len - 1 - i]);
            }
        }
        return result;
    }
    private String[] divide(double num) {
        long zheng = (long) num;//强制转换，得到整数部分
        long xiao = Math.round((num - zheng) * 100);//round函数，四舍五入接近整数
        return new String[] { zheng + "", String.valueOf(xiao) };
    }
    public static void main(String[] args) {
       Scanner scan = new  Scanner(System.in);
       Test test = new Test();
       while(scan.hasNext()) {
           /*String ptr = scan.nextLine();
           String[] str = ptr.split(".");*/
           double input = scan.nextDouble();
           String[] str = test.divide(input);
           String integer = test.toHanStr_Integer(str[0]);
           String decimal = test.toHanStr_Decimal(str[1]);
           String ret = integer + "元" + decimal;
           System.out.println(ret);
       }
    }
}
