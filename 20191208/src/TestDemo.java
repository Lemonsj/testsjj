import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("舞者","王晨艺");
        map.put("歌手","毛不易");
        System.out.println(map);
        String str = map.getOrDefault("演员","慕白");
        System.out.println(str);
        System.out.println(map.containsKey("舞者"));
        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        StringBuffer str1 = new StringBuffer();
    }
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("java");
        collection.add("hello");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        System.out.println(collection);
        ((ArrayList<String>) collection).remove("java");
        collection.add("2019");
        collection.add("wangchenyi");
        System.out.println(collection);
        Object[] strings =  collection.toArray();
    }

}
