public class TestDemo {

    //直接插入排序
    public static void insertSort(int[] array) {
        int j = 0;
        int tmp = 0;
        for(int i = 1; i < array.length; i++) {
            while(j >= 0) {
                tmp = array[i];
                j = i-1;
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
                j--;
            }
            array[j+1] = tmp;
        }
    }

    //希尔排序
    public static void shell(int[] array, int gap) {
        for(int i = gap; i < array.length; i++) {
            int j = 0;
            int tmp = array[i];
            for(j = i-gap; j >= 0; j -= gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else {
                     break;
                }
            }
            array[j+gap] = tmp;
        }
    }
    public static void shellSort(int[] array) {
        int[] drr = {5,3,1};
        for(int i = 0; i < drr.length; i++) {
            shell(array,i);
        }
    }
}
