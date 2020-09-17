package blocking_queue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-16
 * Time: 17:18
 **/
public class CircleQueue {
    private static final int CAPACITY = 16;
    private int[] queue = new int[CAPACITY];
    private int size = 0;
    private int frontIndex = 0;
    private int rearIndex = 0;


    //放入队列
    public void put(int element) {
        if(size == queue.length) {
            throw new RuntimeException("队列已满");
        }

        queue[rearIndex] = element;
        rearIndex = rearIndex+1;

        if(rearIndex == queue.length) {
            rearIndex = 0;
        }

        size++;
    }


    //从队列中取
    public int take() {
        //判断队列是否为空
        if(size == 0) {
            throw new RuntimeException("队列为空");
        }

        //队列不为空
        int element = queue[frontIndex];
        frontIndex += 1;
        if(frontIndex == queue.length) {
            frontIndex = 0;
        }
        size--;
        return element;
    }

}
