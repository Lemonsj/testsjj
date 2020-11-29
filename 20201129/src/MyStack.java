/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-11-29
 * Time: 13:07
 **/
public class MyStack {
    private int[] elem;
    private int usedSize;

    //栈：先进的后出

    public void push(int val) {
        this.elem[usedSize] = val;
        this.usedSize++;
    }

    public int pop() {

        if(isEmpty()) {
            throw new RuntimeException("栈为空！");
        }
        /*this.usedSize--;
        return elem[usedSize];*/

        int data = this.elem[this.usedSize-1];
        this.usedSize--;
        return data;
    }

    public int peek() {
        return elem[usedSize-1];
    }

    public Boolean isEmpty() {
        if(this.usedSize == 0) {
            return true;
        }else {
            return false;

        }
    }

    public int size(){
        return usedSize;
    }

}
