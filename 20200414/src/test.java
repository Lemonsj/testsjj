import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    /*
    木棒拼接
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            List<Integer> list = new ArrayList<>();
            int n = scan.nextInt();
            for(int i = 0; i < n; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                if(x == 1) {
                    list.add(y);
                }else {
                    //list.remove(list.indexOf(y));
                    //list.remove(y);
                    for(i=0;i<list.size();i++){

                        if(list.get(i)==y) list.remove(i);

                    }
                }
                if(isOk(list)) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }
    }

    private static boolean isOk(List<Integer> list) {
        int len = list.size();
        for(int i = 0; i < len; i++) {
            int tmp = list.remove(i);
            int sum = 0;
            for(int j = 0; j < len-1; j++) {
                sum += list.get(j);
            }
            if(sum <= tmp) {
                list.add(i,tmp);
                return false;
            }
            list.add(i,tmp);
        }
        return true;
    }




    /*public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int sum=0;
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            int I=scanner.nextInt();//1或2
            int L=scanner.nextInt();//1<=L<=1 000 000 000
            if(I==1){
                //添加一个长度为L的木棒
                int j=0;
                for (;j<list.size();j++){
                    if(list.get(j)>=L){
                        list.add(j,L);
                        break;
                    }
                }
                if(list.size()==j){
                    list.add(L);
                }
                sum+=L;
            }else {
                //删除第一次出现L元素的索引。
                list.remove(list.indexOf(L));
                sum-=L;
            }
            int max=list.get(list.size()-1);
            if(sum-max>max){
                //任意两边之和大于第三边
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }*/
}
