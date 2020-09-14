/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-14
 * Time: 21:43
 **/
public class 打印所有的状态 {
    public static void main(String[] args) {
        Thread.State[] states = Thread.State.values();
        for(Thread.State state : states) {
            System.out.println(state);
        }
    }
}
