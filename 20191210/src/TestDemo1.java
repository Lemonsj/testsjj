import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestDemo1 {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("My");
        collection.add("idol");
        collection.add("WangChenYi");
        Object[] strings = collection.toArray();
        System.out.println(Arrays.toString(strings));
        System.out.println(collection.isEmpty());
        System.out.println(collection);
        for(String s : collection) {
            System.out.println(s);
        }

    }
}
