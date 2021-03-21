import java.io.*;
import java.net.Socket;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-21
 * Time: 12:37
 **/
public class SendRequestDemo {
    public static void main(String[] args) throws IOException {
        //建立TCP连接
        Socket socket = new Socket("www.baidu.com",80);
        OutputStream os = socket.getOutputStream();
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(os,"UTF-8"));

        //发送HTTP请求


        //请求是GET方法，没有请求体
        String request = "GET / HTTP/1.0\r\n"
                + "Host: www.baidu.com\r\n"
                +"\r\n";
        writer.print(request);
        writer.flush();


        //接收百度发回的HTTP响应
        InputStream is = socket.getInputStream();
        byte[] buffer = new byte[8192];
        int len = is.read(buffer);
        String response = new String(buffer,0,len,"UTF-8");

        //打印响应
        System.out.println(response);
        socket.close();
    }
}
