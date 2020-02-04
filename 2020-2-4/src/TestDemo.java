public class TestDemo {
    public static boolean isPalindrome(int x) {
        if(x > 0 && x < 10) {
            return true;
        }
        if(x < 0) {
            return false;
        }
        int tmp = x;
        int ret = 0;
        while(tmp > 0) {
            int t = tmp % 10;
            tmp /= 10;
            ret = ret*10 + t;
        }
        if(x == ret) {
            return true;
        }
        return false;
    }
    public final int  x = 99;

    public static void main1(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));

    }
    /*public static void main(String[] args) {//2
        System.out.println("value="+switchit(4));//3
    }//4
    public static int switchit(int x) {
        int j=1;
        switch (x) {
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        return j+x;
    }*/

}
