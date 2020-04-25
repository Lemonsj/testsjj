import java.util.*;
public class test {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,2,2,5,4,2};
        int tmp = 0;
        for(int i = 0; i < array.length-1; i++){
            for(int j = i; j < array.length-1; j++) {
                if(array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("******************************");
        System.out.println(array[array.length/2]);
    }


    public class Solution {
        public int MoreThanHalfNum_Solution(int [] array) {
            int len=array.length;
            if(len<1){
                return 0;
            }
            int count=0;
            Arrays.sort(array);
            int num=array[len/2];
            for(int i=0;i<len;i++){
                if(num==array[i])
                    count++;
            }
            if(count<=(len/2)){
                num=0;
            }
            return num;
        }
    }
}
