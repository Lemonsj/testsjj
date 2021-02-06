import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-02-06
 * Time: 12:46
 **/
class OuterClass{
    public int data1 = 10;
    int data2 = 20;
    private int data3 = 30;
    public static int data4 = 40;

    /**
     * 实例内部类
     * 相当于实例属性
     * 如何得到实例内部类的对象?
     *外部类名.内部类名     变量  =  外部类对象的引用.new 内部类（）
     *OuterClass.InnerClass innerClass = outerClass.new InnerClass();
     *
     * 静态内部类
     * OuterClass2.InnerClass2 innerClass = new OuterClass2.InnerClass();
     * */

     class InnerClass {
         public int data5 = 50;
         public static final int data6 = 13;
         public void func() {
             System.out.println("InnerClass::func()!");
         }
    }
}
class TopKComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
class TOPK{
    public static Integer[] findNum(Integer[] array,int k) {
        TopKComparator topKComparator = new TopKComparator();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k,topKComparator);
        for(int i = 0; i < k; i++) {
            if(minHeap.size() < k) {
                minHeap.offer(array[i]);
            }else {
                Integer val = minHeap.peek();
                if(val < array[i]) {
                    minHeap.poll();
                    minHeap.offer(array[i]);
                }
            }
        }
        Integer[] ret = new Integer[k];
        for(int i = 0; i < k; i++) {
            Integer num = minHeap.poll();
            ret[i] = num;
        }
        return ret;
    }
}
public class Test {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.data1);
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }
}
