import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-24
 * Time: 23:19
 **/
//排序
public class Test {

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("输入第"+(i+1) +"个数");
                arr[i] = scan.nextInt();
            }
            System.out.println("开始排序");
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

    }
    public static class SeletSort {
        public static void main(String[] args) {
            int a[] = { 2, 3, 6, 4, 0, 1, 7, 8, 5, 9 };
            seletSort(a);
        }

        public static void toString(int[] a) {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }

        private static void seletSort1(int[] a) {
            int length = a.length;
            int temp = 0;
            for (int j = 0; j <length- 1;j++) {
                for (int i = j; i < length- 1; i++) {
                    if (a[j] > a[i + 1]) {
                        // change
                        temp = a[j];
                        a[j] = a[i + 1];
                        a[i + 1] = temp;
                    }
                }
            }
            toString(a);
        }


        private static void seletSort(int[] a) {
            int length = a.length;
            int temp = 0;
            int minIndex;
            for (int j = 0; j <length- 1;j++) {
                minIndex = j;
                for (int i = j; i < length- 1; i++) {
                    if (a[minIndex] > a[i + 1]) {
                        minIndex = i+1;
                    }
                }
                temp = a[minIndex];
                a[minIndex]= a[j];
                a[j]=temp;
            }
            toString(a);
        }

    }



}
