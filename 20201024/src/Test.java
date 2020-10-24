/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-24
 * Time: 18:15
 **/
public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.display();
        /*myLinkedList.addLast(5);
        myLinkedList.display();
        myLinkedList.addIndex(2,999);
        myLinkedList.display();*/
        //System.out.println(myLinkedList.size());

        //System.out.println(myLinkedList.remove(3));

        myLinkedList.clear();
        System.out.println("abcdefg");
    }
}
