package SingleDemo;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-16
 * Time: 17:40
 **/


/*
 * 单例模式--》懒汉模式
 * */
public class Lazying {
    private static volatile  Lazying instance = null;

    private Lazying() {

    }


    public  static Lazying getInstance() {
        if(instance == null) {
            synchronized (Lazying.class) {
                if(instance == null) {
                    instance = new Lazying();
                }
            }
        }
        return instance;
    }


}




