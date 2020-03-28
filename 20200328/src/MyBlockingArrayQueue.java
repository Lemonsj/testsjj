import java.util.Scanner;

public class MyBlockingArrayQueue {
    int[] array = new int[10];
    int front = 0;
    int rear = 0;
    int size = 0;

    synchronized  void put(int value) throws InterruptedException{
        while(size == array.length) {
            wait();
        }
        array[rear] = value;
        //
        rear++;
        if(rear == array.length) {
            rear = 0;
        }
        //rear = (rear+1)%array.length
        size++;
        System.out.println(size);
        notifyAll();
    }
    synchronized  int take() throws InterruptedException {
        while(size==0) {
            wait();
        }
        int value = array[front];
        front++;
        if(front == array.length) {
            front = 0;
        }
        size--;
        System.out.println(size);
        notifyAll();
        return value;
    }
    static MyBlockingArrayQueue queue = new MyBlockingArrayQueue();
    static class Producer extends Thread {

        @Override
        public void run() {
            try{
                for(int i = 0; i < 100; i++) {
                    System.out.println("准备放入 " + i);
                    queue.put(i);
                    System.out.println("放入成功");
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Producer producer = new Producer();
            producer.start();

            Thread.sleep(2*1000);
            Scanner scan = new Scanner(System.in);
            while(true) {
                scan.nextLine();
                System.out.println(queue.take());
            }
        }
    }
}
