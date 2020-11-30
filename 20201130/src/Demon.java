import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-30
 * Time: 20:17
 **/
public class Demon {
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] ptr = str.split(" ");
            int[] arr = new int[ptr.length-1];
            int i = 0;
            for(; i < arr.length; i++) {
                arr[i] = Integer.parseInt(ptr[i]);
            }
            int k = Integer.parseInt(ptr[i]);
            Arrays.sort(arr);
            for(int j = 0; j < k; j++) {
                System.out.print(arr[j] + " ");
            }
        }
    }
    static class A{
        protected int value;

        public A(int v){
            setValue(v);
        }
        public void setValue(int value) {
            this.value = value;
        }
        public int getValue() {
            try{
                value++;
                return value;
            }catch (Exception e) {
                System.out.println(e.toString());
            }finally{
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B() {
            super(5);
            setValue(getValue()-3);
        }
        public void setValue(int value) {
            super.setValue(2*value);
        }
    }



}
