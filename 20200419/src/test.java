import java.util.Scanner;

public class test {
    public static int findbig(int[] arr,int n) {
        int big = 0;
        int tmp = 0;
        int p = 0;
        int q = 0;
        int i = 0;
        int flag = 0;
        while(i < n) {
            if(flag == 0) {
                p = 0;
            }else {
                p = q+2;
            }
            if(arr[i] < 0 || i+1 == n) {
                flag = 1;
                if(i+1 == n) {
                    q = i;
                }else {
                    q = i-1;
                }
                if(i != 0) {

                    for(int j = p; j <= q; j++) {
                        tmp += arr[j];
                    }
                    if(tmp > big) {
                        big = tmp;
                    }
                }

            }
            //p = q+2;
            i++;
        }
        return big;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int ret = findbig(arr,n);
            System.out.println(ret);
        }
        /*int n = 3;
        int[] arr = {-1,2,1};
        int ret = findbig(arr,n);
        System.out.println(ret);*/
    }
}
