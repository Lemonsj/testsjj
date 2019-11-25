public class TestDemo {
    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addFirst(2);
        doubleList.addFirst(1);
        doubleList.addLast(3);
        doubleList.addLast(4);
        doubleList.addLast(5);
        doubleList.display();
        System.out.println();
        System.out.println("**********************");
        doubleList.remove(3);
        doubleList.display();
    }
}
