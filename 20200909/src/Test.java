/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-29
 * Time: 20:25
 **/
public class Test {
    public static void main1(String[] args) {
        //int num = 1;
        int sum = 0;
        for(int i = 1; i <=5; i++) {
            int ret = 1;
            for(int j = 1; j <= i; j++) {
                ret *= j;
            }
            sum += ret;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        int ret = 1;
        int sum = 0;
        while(i <= num){
            ret *= i;
            i++;
            sum += ret;

        }
        System.out.println(sum);
    }
}
