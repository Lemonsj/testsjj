public class test {
    public static void main(String[] args) {

        MySingleList mySingleList = new MySingleList();

        /*mySingleList.addLast(1);

        mySingleList.addLast(4);

        mySingleList.addLast(2);
        mySingleList.addLast(2);
        mySingleList.addLast(2);
        mySingleList.addLast(3);*/

        mySingleList.addLast(1);
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(3);
        System.out.println(mySingleList.deleteDuplication());
        /*mySingleList.addFirst(4);
        mySingleList.addFirst(3);
        mySingleList.addFirst(2);
        mySingleList.addFirst(1);*/
        System.out.println(mySingleList.contains(4));
        //mySingleList.display();
        //System.out.println(mySingleList.deleteDuplication());
        System.out.println("*************************");
    }
}
