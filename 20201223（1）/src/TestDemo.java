/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-23
 * Time: 17:26
 **/
public class TestDemo {

    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] array = { 27,15,19,18,28,34,65,49,25,37};
        testHeap.createHeap(array);
        testHeap.show();
    }
}
