import javax.crypto.Cipher;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-16
 * Time: 17:21
 **/
public class CricleQueue {
    private int[] elem;
    private int front;
    private int rear;

    public CricleQueue(int k) {
        int[] elem = new int[k];
        this.front = 0;
        this.rear = 0;
    }


    public boolean enQueue(int val) {
        if(isFull()) {
            return false;
        }else {
            this.elem[rear] = val;
            this.rear = (this.rear + 1) % this.elem.length;
        }
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }else {
            this.front = (this.front + 1) % this.elem.length;
        }
        return true;
    }

    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[this.front];
    }

    public int getRear() {
        if(isEmpty()) {
            return -1;
        }

        int index = (this.rear == 0) ? this.elem.length-1 : this.rear -1;
        return this.elem[index];
    }

    public boolean isFull() {
        if((this.rear + 1) % this.elem.length == this.front) {
            return true;
        }

        return false;
    }

    public boolean isEmpty() {
        if(this.front == this.rear) {
            return true;
        }
        return false;
    }
}
