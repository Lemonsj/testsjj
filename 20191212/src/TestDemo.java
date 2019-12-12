import java.util.ArrayList;
import java.util.List;

class A<T> {
    T value;

    public A(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}
public class TestDemo {
    public static void main(String[] args) {

    }

    public static void main2(String[] args) {
        List myList=new ArrayList();
    }
    public static void main1(String[] args) {
        A<String> str = new A<>("WangChenYi");
        System.out.println(str.get());
        System.out.println(str.value);
    }
}
