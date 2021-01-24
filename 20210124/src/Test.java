import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-01-24
 * Time: 12:38
 **/
public class Test {
    public static void main1(String[] args) {
        int x = 4;
        int y = 8;
        int ret = Maxnum(x,y);
        System.out.println(ret);
    }
    //求最大公约数
    public static int Maxnum(int x,int y) {
        if(x > y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        for(int i = x; i >= 1; i--) {
            if(x%i == 0 && y%i == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int a = 0;
        while(scan.hasNext()) {
            n = scan.nextInt();
            a = scan.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            for(int i = 0; i < n; i++) {
                if(array[i] <= a) {
                    a += array[i];
                }else{
                    a += Maxnum(array[i], a);;
                }
            }
            System.out.println(a);
        }
        scan.close();
    }
    public static void main3(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=0;  //怪物的初始能力
        int ability=0; //小易的初始能力值
        while(sc.hasNext()){
            n=sc.nextInt();
            ability=sc.nextInt();
            for(int i=0;i<n;i++){
                int monster=sc.nextInt(); //怪物的防御能力
                if(monster<=ability){
                    ability+=monster;
                }else{
                    ability+=Maxnum(monster,ability);
                }
            }
            System.out.println(ability);
        }
        sc.close();
    }
}
