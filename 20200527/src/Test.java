/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-27
 * Time: 19:12
 **/
public class Test {


    //希尔排序+直接选择排序+堆排


    //希尔排序
    public void shell(int[] array, int gap) {
        for(int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j = 0;
            for(j = i-gap; j >=0; j-=gap) {
                if(array[j] > tmp) {
                    array[j+gap] = array[j];
                }else{
                    break;
                }
            }
            array[j+gap] = tmp;
        }

    }
    public void shellSort(int[] array) {
        int[] dir = {5,3,1};
        for(int i = 0; i < dir.length; i++) {
            shell(array,dir[i]);
        }
    }




    //直接选择排序
    public void selectSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1;j < array.length; j++) {
                if(array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

    }
    public static void main(String[] args) {

    }
}
