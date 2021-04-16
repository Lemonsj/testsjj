import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-04-16
 * Time: 12:34
 **/
public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("tom",100);
        map.put("pop",98);
        map.put("sam",28);
        Set<Entry<String,Integer>> set = map.entrySet();
        for(Entry<String,Integer> entry : set) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
