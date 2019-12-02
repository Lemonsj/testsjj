import java.util.Arrays;

public class TestDemo3 {
    /*int[] array = {1,2,3,4};
    int[] array2 = new int[4];
    int[] array3 = new int[]{5,6,7,8};
    int[] array4 = Arrays.copyOf(array, array.length);
    int[] array5 = array3.clone();
    //int[] array6 = System.arraycopy(array,1,array3,0,3);*/

    public static void reverse(char[] array, int left, int right) {
        while(left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static String reverseSentence(String str) {
        char[] array = str.toCharArray();
        reverse(array, 0, array.length-1);
        int i = 0;

        int j = 0;
        while(i < array.length) {
            if(array[i] == ' ') {
                i++;
                j++;
            }else if(j == array.length || array[j] == ' ') {
                reverse(array, i, j-1);
                i = ++j;
            }else{
                j++;
            }
        }
        return String.copyValueOf(array);
    }
    public static void main(String[] args) {
        String ret = reverseSentence("student am I");
        System.out.println(ret);
    }


}
