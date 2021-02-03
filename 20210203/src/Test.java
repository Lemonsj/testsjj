import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-02-03
 * Time: 17:26
 **/
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        while(scan.hasNext()) {
            String path = scan.next();
            int id = path.lastIndexOf("\\");
            String filename = id == -1 ? path : path.substring(id + 1);
            int line = scan.nextInt();
            String key = filename + line;
            if(map.containsKey(key)) {
                map.put(key,map.get(key)+1);
            }else {
                map.put(key,1);
            }
        }
        //String[] ptr = str.split("\\\\");
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });
        //只输出前8条
        int m = 0;
        for(Map.Entry<String, Integer> mapping : list){
            if (m >= 8) {
                break;
            }
            String[] str = mapping.getKey().split(" ");
            String filename = str[0];
            if (filename.length() > 16) {
                filename = filename.substring(filename.length() - 16);
            }
            String n = str[1];
            Integer count = mapping.getValue();
            System.out.printf("%s %s %d%n", filename, n, count);
            m++;
        }
    }

    public static void main2(String[] args) {
        String str = "E:\\V1R2\\product\\fpgadrive.c 1325";
        String[] ptr = str.split("\\\\");
        System.out.println(Arrays.toString(ptr));
    }
}
