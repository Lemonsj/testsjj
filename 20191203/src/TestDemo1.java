public class TestDemo1 {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        mySingleList.addLast(5);
        //mySingleList.removeAllKeys(3);
        ListNode newHead = mySingleList.reverseList();
        mySingleList.display2(newHead);

    }
}
