import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-12-24
 * Time: 16:43
 **/
public class TestHeap {
    public int[] elem;
    public int usedSize;
    public TestHeap() {
        int[] elem = new int[10];
        this.usedSize = 0;
    }


    public void createHeap(int[] array) {
        for(int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }

        for(int i = (this.usedSize-1-1)/2; i >= 0; i--) {
            adjustDown(i,this.usedSize);
        }
    }

    //向下调整,构建一个大根堆
    private void adjustDown(int root, int len) {
        int parent = root;
        int child = 2*parent + 1;

        while(child < len) {
            if((child + 1 < len) && this.elem[child] < this.elem[child+1]) {
                child++;
            }

            if(this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2*parent + 1;
            }else {
                break;
            }
        }
    }

    public void show() {
        for(int i = 0; i < this.usedSize; i++) {
            System.out.println(this.elem[i] + " ");
        }
        System.out.println();
    }

    public void push(int val) {
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize] = val;
        this.usedSize++;
        adjustUp(this.usedSize-1);
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

    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    public boolean isEmpty() {
        return this.usedSize == 0;
    }
    public void pop() {
        if(isEmpty()) {
            throw new RuntimeException("堆为空！");
        }
        this.elem[0] = this.elem[this.usedSize-1];
        this.usedSize--;
        adjustDown(0,this.usedSize);
    }

    public int getTop() {
        if(isEmpty()) {
            throw new RuntimeException("堆为空！");
        }
        return this.elem[0];
    }
}
