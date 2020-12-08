import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-08
 * Time: 20:50
 **/
public class Test {
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            //String[] array = str.split(" ");
            char[] ptr = str.toCharArray();
            int[] arr = new int[ptr.length];
            for(int i = 0; i < ptr.length; i++) {
                arr[i] = ptr[i]-'0';
            }
            //System.out.println(arr[0]);
            Arrays.sort(arr);
            int i = 0;
            int j = 0;
            Boolean flag = false;
            String ret = "";
            while(i < arr.length) {
                if(arr[0] == 0 && flag == false) {
                    flag = true;
                    while(arr[j] == 0) {
                        j++;
                    }
                    int k = 0;
                    ret = ret + (arr[j] + "");
                    while(k < j){
                        ret = ret + (arr[k] + "");
                        k++;
                    }
                }else {
                    ret = ret + (arr[j] + "");
                }
                System.out.println(ret);
            }
        }
    }

    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            char[] ptr = str.toCharArray();
            int[] arr = new int[ptr.length];
            for (int i = 0; i < ptr.length; i++) {
                arr[i] = ptr[i] - '0';
            }
            Arrays.sort(arr);
            int i = 0;
            String ret = "";
            while (true) {
                if(arr[i] == 0 ) {
                    i++;
                }else {
                    break;
                }

            }
            ret = ret + (arr[i] + "");
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    ret = ret + (arr[j] + "");
                }
            }
            System.out.println(ret);
        }
    }*/

    public static String func(String str){

        String[] ptr = str.split(" ");
        int[] arr = new int[ptr.length];
        for (int i = 0; i < ptr.length; i++) {
            arr[i] = Integer.parseInt(ptr[i]);
        }
        Arrays.sort(arr);
        int i = 0;
        String ret = "";
        while (true) {
            if(arr[i] == 0 ) {
                i++;
            }else {
                break;
            }

        }
        ret = ret + (arr[i] + "");
        for (int j = 0; j < arr.length; j++) {
            if (j != i) {
                ret = ret + (arr[j] + "");
            }
        }
        return ret.toString();
    }
    public static void main3(String[] args) {
        String str = "0 1 3 2 4";
        String ret = func(str);
        System.out.println(ret);
    }
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            String str = scan.nextLine();
            String[] ptr = str.split(" ");
            int[] arr = new int[ptr.length];
            for (int i = 0; i < ptr.length; i++) {
                arr[i] = Integer.valueOf(ptr[i]);
            }
            //System.out.println(arr[0]);
            Arrays.sort(arr);
            int i = 0;
            String ret = "";
            while (true) {
                if(arr[i] == 0 ) {
                    i++;
                }else {
                    break;
                }
            }
            ret = ret + (arr[i] + "");
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    ret = ret + (arr[j] + "");
                }
            }
            System.out.println(ret);
        }
    }

    public static void main5(String[] args) {
        Scanner  scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int tmp = n*(n-1) + 1;
            for(int i = 0; i < n-1; i++) {
                System.out.println(tmp+"+");
                tmp += 2;
            }
            System.out.println(tmp+"+");
        }

    }

    public static void main6(String[] args) {
        String s1 = "abc" + "def";
        String s2 = new String(s1);
        if(s1.equals(s2)) {
            System.out.println(".equals succeeded");
        }
        if(s1 == s2) {
            System.out.println("==succeeded");
        }
    }

    public static void main(String[] args) {
        System.out.println("avlue = " +fun(4));
    }
    public static int fun(int x) {
        int j = 1;
        switch(x) {
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        return j+x;
    }
}
