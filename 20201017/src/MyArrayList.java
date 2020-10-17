import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-17
 * Time: 19:46
 **/
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int Capacity = 10;

    public MyArrayList(){
        this.elem = new int[Capacity];
        this.usedSize = 0;
    }


    public  void display(){
        for(int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");

        }
    }
    private boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    //在pos位置新增元素
    public void add(int pos,int data){

        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
        }
        if(pos < 0 || pos > this.usedSize) {
            System.out.println("该位置不合法！");
            return;
        }
        for(int i = this.usedSize-1; i >= pos; i--) {
            elem[i+1] = elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    public boolean contains(int toFind) {
        for(int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    public int search(int toFind) {
        for(int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }


    private boolean isEmpty() {
        return this.usedSize == 0;
    }
    public int getPos(int pos) {
        if(this.usedSize == 0 || pos < 0 || pos >= this.usedSize) {
            return -1;
        }
        return this.elem[pos];
    }

    public int size() {
        return this.usedSize;
    }


    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("该元素不存在");
            return;
        }
        for(int i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }
}
