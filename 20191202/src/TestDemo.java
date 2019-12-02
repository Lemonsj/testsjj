import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addFirst(2);
        mySingleList.addFirst(1);
        mySingleList.addLast(3);
        mySingleList.addIndex(3,4);
        mySingleList.diaplay();
        /*int[] array = {1,2,3,4};
        try{
            int a = 10/0;
            System.out.println(a);
        }catch(NullPointerException e) {
            e.printStackTrace();
            System.out.println("捕获到了异常！");
        }finally {
            System.out.println("finally");
        }
        System.out.println("after");
        System.out.println(Arrays.toString(array));*/
    }


}
