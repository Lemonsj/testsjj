/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-19
 * Time: 17:01
 **/
public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        //myLinkedList.display();
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.display();

        myLinkedList.addFirst(4);
        myLinkedList.display();
        myLinkedList.removeAllKey(4);
        myLinkedList.display();
        myLinkedList.clear();
        myLinkedList.display();
        /*myLinkedList.remove(5);
        myLinkedList.display();
        myLinkedList.remove(1);
        myLinkedList.display();*/

        //System.out.println(myLinkedList.contains(5));
        /*myLinkedList.addIndex(2,8);
        myLinkedList.display();
        myLinkedList.addIndex(2,7);
        myLinkedList.display();
        myLinkedList.addIndex(7,10);
        myLinkedList.display();*/
        /*myLinkedList.addIndex(0,9);
        myLinkedList.display();*/
        /*myLinkedList.display();
        System.out.println(myLinkedList.size());*/
    }
}
