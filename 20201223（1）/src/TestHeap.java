import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-23
 * Time: 17:26
 **/
public class TestHeap {
    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
        this.usedSize = 0;
    }
    public void createHeap(int[] array) {
        for(int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        
        //已知孩子节点求根节点：（n-1）/2
        //i代表每颗子树的根节点
        for(int i = (this.usedSize-1-1)/2; i >= 0; i--) {
            adjustDown(i,this.usedSize);
        }
    }



    public int[] smallestk(int[] arr,int k) {
        int[] ret = new int[k];
        if(arr == null || k < 0) {
            return ret;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(arr.length);
        for(int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
        for(int i = 0; i < k; ++i) {
            ret[i] = queue.poll();
        }
        return ret;
    }





    public void show() {
        for(int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    private void adjustDown(int root, int len  ) {
        int parent = root;
        int child = 2*parent + 1;

        while(child < len) {
            //(child+1 < len) 证明有右孩子
            if((child+1 < len) && this.elem[child] < this.elem[child+1]) {
                child++;
            }
            //child保存的是左右孩子最大值的下标
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;//无法确定子树是否调整完毕
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    private void adjustUp(int child) {
        int parent = (child-1)/2;
        while(child > 0) {
            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                child = parent;
                parent = (child-1)/2;
            }else {
                break;
            }
        }
    }
    public void push(int val) {
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);

        }
        this.elem[this.usedSize] = val;
        this.usedSize++;
        adjustUp(this.usedSize-1);
    }

    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }


    public boolean isEmpty() {
        return this.usedSize == 0;
    }
    public void pop() {
        if(isEmpty()) {
            throw new RuntimeException("堆为空");
        }
        this.elem[0] = this.elem[this.usedSize-1];
        this.usedSize--;
        adjustDown(0,this.usedSize);
    }

    public int getTop(){
        if(isEmpty()) {
            throw new RuntimeException("堆为空");
        }
        return this.elem[0];
    }

    //13堆
    // 看到一小时十分钟的位置
}
