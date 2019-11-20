public class TestDemo {
    public static void main(String[] args) {
        SingleList singleList = new SingleList();
        singleList.addLast(1);
        singleList.addLast(2);
        singleList.addLast(3);
        singleList.addLast(2);
        singleList.addLast(1);
        System.out.println(singleList.chkPalindrome());
        //System.out.println(singleList.findMid());
        //singleList.addFirst(3);
        //singleList.addFirst(2);
        //singleList.addFirst(1);
        //singleList.partition(3);
        //singleList.display();
        //ListNode newhead = singleList.removeRepetition();
        //singleList.display2(newhead);

    }
}
