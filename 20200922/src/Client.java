import java.io.IOException;
import java.io.*;
import java.util.*;
import java.net.*;
/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-23
 * Time: 15:15
 **/
public class Client {
    public static void main(String[] args) throws IOException {

        /*String request = "你好世界";
        if(args.length > 0) {
            request = args[0];
        }*/


        //建立连接
        Socket socket = new Socket("127.0.0.1",9898);

        Scanner console = new Scanner(System.in);
        System.out.println("请输入请求》");
        String request = console.nextLine();

        //写入请求
        OutputStream os = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(
                new OutputStreamWriter(os,"UTF-8")
        );
        //writer.println("你好世界");
        writer.println(request);
        writer.flush();


        //读取响应
        InputStream is = socket.getInputStream();
        Scanner scan = new Scanner(is,"UTF-8");

        String response = scan.nextLine();
        System.out.println(response);

    }
}
