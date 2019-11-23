public class TestDemo1 {
    public static void main(String[] args) {
        SingleList singleList = new SingleList();
        //singleList.addFirst(2);
        //singleList.addFirst(1);
        singleList.addLast(1);
        singleList.addLast(7);
        singleList.addLast(5);
        singleList.addLast(2);
        singleList.addLast(8);
        singleList.createLoop();
        //ListNode newhead = singleList.divisionList(3);
        //singleList.display();
        System.out.println(singleList.hasCircle());
        //singleList.addLast(4);
        //singleList.addIndex(2,3);
        //.singleList.removeAllkey(4);
        //singleList.remove(4);
        //System.out.println(singleList.contains(1));
        //singleList.clear();
        //ListNode newhead = singleList.reserveList();
        //singleList.display2(newhead);
        //System.out.println(singleList.middleNode());
        //singleList.display2(newhead);

    }
}
