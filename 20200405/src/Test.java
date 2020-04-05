import java.util.Scanner;

public class Test {
    public static void main1(String[] args) {
        int n = 10;
        char ch = 'a';
        int col=(n+1)/2;
        for(int i=0;i<col;i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == col - 1 || j == n - 1) {
                    //唯一一个思考点
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            int sum = scan.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int count = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 1; j < n; j++) {
                    if(arr[i] + arr[j] == sum) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            int n = scan.nextInt();
            float fenmu = denminator(n);
            float fenzi = misSort(n);
            float result = (fenzi/fenmu)*100;
            System.out.println(String.format("%2f", result) + "%");

        }
    }
    private static  float denminator(int n) {
        float result = 1;
        if(n == 1) {
            return 1;
        }else if(n>1){
            result = n*denminator(n-1);
        }
        return result;
    }

    private static float misSort(int n) {
        if(n == 1) {
            return 0;
        }else if(n == 2) {
            return 1;
        }else {
            return (n-1)*(misSort(n-1) + misSort(n-2));
        }
    }
}
