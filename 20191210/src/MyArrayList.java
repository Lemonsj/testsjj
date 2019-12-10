public class MyArrayList<T> {
    public T[] elem;
    public int usedsize;
    public MyArrayList() {
        this.elem = (T[])new Object[10];
        this.usedsize = 0;
    }
    public void add(T data) {
        this.elem[this.usedsize] = data;
        this.usedsize++;
    }
    public Object get() {
        return this.elem[this.usedsize-1];
    }
}
