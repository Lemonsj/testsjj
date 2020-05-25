/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-25
 * Time: 22:55
 **/
public class Test {

    //直接插入排序
    /*
    直接插入的时间复杂度：最好：O(n)-->有序的时候，数据越有序越快
                      最坏：O(n^2)
    直接插入的空间复杂度：O(1) 是一个稳定的排序
    */
    public static void insertSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j;
            for(j = i-1; j >= 0; j++) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }


    //希尔排序
    /*
    
    */

    public static void main(String[] args) {

    }
}
