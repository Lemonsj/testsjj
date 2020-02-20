public class MyArrayList {

    public int[] elem;
    public int usedSize;

    public MyArrayList() {
        this.elem = new int[10];
        this.usedSize = 0;
    }
    public void display() {
        for(int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }

    }
    public void add(int pos, int data) {
        this.elem[pos] = data;
        this.usedSize++;
    }
    public boolean contains(int tofind) {
        for(int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == tofind) {
                return true;
            }
        }
        return false;
    }




}
