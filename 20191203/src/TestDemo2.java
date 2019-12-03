import java.util.Scanner;

public class TestDemo2 {
    /*public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        for (int x: array) {
            System.out.println(x);
        }
    }*/
    //判断是否为回文
    public static boolean is_plaLindRome(char[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            if(array[left] == array[right]) {
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
    //删除一个字符
    public static char[] remove(char[] array, int i) {
        if(i == array.length-1) {
            array[i] = ' ';
            return array;
        }
        for(int k = i; k < array.length-1; k++) {
            array[k] = array[k+1];
        }
        return array;
    }
    public static int func(String str) {
        char[] array = str.toCharArray();
        //char[] array2 = Arrays.copyOf(array,array.length);
        int start = 0;
        int end = str.length()-1;
        boolean ret = is_plaLindRome(array);
        if(ret) {
            return -1;
        }
        while(end >= 0) {
            char[] ptr = remove(array, start);
            end--;
            start++;
            ret = is_plaLindRome(ptr);
            if (ret) {
                return --start;
            }
        }
        return -2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str1 = scan.next();
        String str2 = scan.next();
        String str3 = scan.next();
        System.out.println(func(str1));
        System.out.println(func(str2));
        System.out.println(func(str3));
    }
}


