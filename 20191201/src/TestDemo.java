import java.util.Arrays;
public class TestDemo {
    public static String changed(String str){
        if(str == null || str.length() <= 0) {
            return null;
        }
        char ch = str.charAt(0);//得到字符串的第一个字符
        int repcount = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length() ; i++) {
            if(str.charAt(i) == ch) {
                repcount++;
            }else {
                sb.append(repcount).append(ch);
                ch = str.charAt(i);
                repcount = 1;
            }
        }
        return sb.append(repcount).append(ch).toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcddee";
        String tmp =  changed(str);
        System.out.println(tmp);
    }
    //合并数组
    public static int[] mergeArray(int[] array1, int[] array2) {
        int[] array = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < array1.length && j < array2.length) {
            if(array1[i] <= array2[j]) {
                array[count++] = array1[i++];
            }else {
                array[count++] = array2[j++];
            }
        }
        while(i < array1.length) {
            array[count++] = array1[i++];
        }
        while(j < array2.length) {
            array[count++] = array2[j++];
        }
        return array;

    }

    public static void main1(String[] args) {
        int[] array1 = {1,3,5,7};
        int[] array2 = {2,4,6,8};
        int[] array = mergeArray(array1, array2);
        System.out.println(Arrays.toString(array));
    }
}
