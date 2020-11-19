/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-19
 * Time: 19:57
 **/
public class MyArrayList {
    public int[] elem;
    public int usedSize;

    public MyArrayList() {
        this.elem = new int[10];
        this.usedSize = 0;
    }

    public void insert(int val) {
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }
    public int getPos(int pos) {
        return this.elem[pos];
    }
}
