public class TestDemo {
    public static void main(String[] args) {
        //顺序表
        /*MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,2);
        myArrayList.add(1,4);
        myArrayList.add(2,6);
        myArrayList.add(3,8);
        myArrayList.display();*/


        //单链表

        MySingleList mySingleList = new MySingleList();
        mySingleList.addFirst(3);
        mySingleList.addFirst(2);
        mySingleList.addFirst(1);
        mySingleList.addLast(4);
        mySingleList.addLast(5);
        mySingleList.addLast(6);

        mySingleList.addIndex(6,7);
        System.out.println(mySingleList.contains(10));;
        mySingleList.display();
        System.out.println();
        System.out.println(mySingleList.size());
        mySingleList.remove(5);
        mySingleList.display();

    }
}
