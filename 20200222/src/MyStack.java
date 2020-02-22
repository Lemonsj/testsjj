public class MyStack<T> {
    public T[]elem;
    public int top;

    public MyStack() {
        this.elem = (T[])new Object[10];
        this.top = 0;
    }

    private boolean isFull() {
        return this.top == this.elem.length;
    }

    public void push(T val) {
        if(isFull()) {
            return;
        }
        this.elem[this.top] = val;
        top++;
    }

    private boolean isEmpty() {
        return this.top == 0;
    }

    public T pop() {
        if(isEmpty()) {
            return null;
        }
        T tmp = this.elem[top-1];
        this.top--;
        return tmp;
    }

    public T getTop() {
        if(isEmpty()) {
            return null;
        }
        return this.elem[top-1];
    }
}
