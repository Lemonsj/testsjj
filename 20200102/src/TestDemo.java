import java.util.Arrays;

public class TestDemo {
/*    public String change(String str) {
        char ch
    }
    public static void main(String[] args) {
        *//*int array[] = {1,2,3,4};
        try {
            System.out.println(array[10]);
            System.out.println("after1");
        }catch (ArrayIndexOutOfBoundsException e){
           e.printStackTrace();
        }finally {
            System.out.println("after2");
        }
       *//*


        //合并数组
        int[] array1 = {1,3,6,9};
        int[] array2 = {2,4,6,8};
        int[] array = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < array1.length  && j < array2.length ) {
            if(array1[i] <= array2[j]) {
                array[count++] = array1[i];
                i++;
            }else {
                array[count++] = array2[j];
                j++;
            }
        }
        while(i < array1.length) {
            array[count++] = array1[i++];
        }
        while(j < array2.length) {
            array[count++] = array2[j++];
        }
        *//*for (int k = 0; k <= count ; k++) {
            System.out.println(array[k]);
        }*//*
        System.out.println(Arrays.toString(array));
    }*/

    //
    public static void reverse(char[] array,int left,int right) {
        while (left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static String reverseSentence(String str) {
        char[] array = str.toCharArray();
        reverse(array,0,array.length-1);
        int i = 0;
        int j = 0;
        //单词逆置
        while (i < array.length) {
            if(array[i] == ' ') {
                i++;
                j++;
            }else if(j == array.length || array[j] == ' '){

            }
            reverse(array, i, j);
            i = j;
        }
        return String.copyValueOf(array);
    }

    public static void main(String[] args) {
        String ret = reverseSentence("i am student");
        System.out.println(ret);
    }
}

