import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-24
 * Time: 16:30
 **/
public class parseUrlTest {
    public static void main(String[] args) {
        String[] urlList = {
                "https://www.baidu.com/thread-809.htm",
                "http://www.baidu.com/thread-809.htm?query=mubai"

        };
        for (String url: urlList) {
            parseUrl(url);
            System.out.println("*****************");
        }
    }



    private static Map<String,Integer>  standardPort = new HashMap<>();
    static{
        standardPort.put("ssh",22);
        standardPort.put("http",80);
        standardPort.put("https",443);
    }

    //协议
    //域名orIP
    //端口（可以省略）
    //路径
    //查询字符串（可以省略）
    private static void parseUrl(String url) {
        int i = url.indexOf("://");
        String schema = url.substring(0,1);
        System.out.println(schema);

        String rest = url.substring(i+3);
        System.out.println(rest);


        i = rest.indexOf("/");
        String host = rest.substring(0,i);
        rest = rest.substring(i);

        String[] fragments = host.split(":");
        String domainOrIP;
        int port;

        if(fragments.length == 1) {
            domainOrIP = host;
            //TODO:没有考虑不认识的协议的情况
            port = standardPort.get(schema);
        }else{
            domainOrIP = fragments[0];
            port = Integer.parseInt(fragments[1]);
        }

        System.out.println(domainOrIP);
        System.out.println(port);

/*
        fragments = rest.split("\\?");//在这里\\是对？的转义，因为？是特殊字符
        String path;
        String queryString;
        if(fragments.length == 1) {
            path = rest;
            queryString = "";
        }else {
            path = fragments[0];
            queryString = fragments[1];
        }
        System.out.println(path);
        System.out.println(queryString);*/


    }
}
