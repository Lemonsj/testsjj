import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-23
 * Time: 15:04
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        //开一家店
        ServerSocket serversocket = new ServerSocket(9898);
        //循环处理业务
        while(true) {
            //等待连接
            Socket socket = serversocket.accept();

            //获取输入流
            InputStream is = socket.getInputStream();
            //封装成Scanner
            Scanner scan = new Scanner(is,"UTF-8");
            //使用\r\n进行分割的方式，读取一个请求
            String request = scan.nextLine();
            System.out.println("收到请求"+request);
            //业务处理
            String response = request;

            //发送响应，也许要使用\r\n跟在后面，进行分割
            OutputStream os = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(
                    new OutputStreamWriter(os,"UTF-8")
            );

            //发送响应
            writer.println(response);
            writer.flush();

            socket.close();


        }
    }
}
