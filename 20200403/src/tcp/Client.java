package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1. 创建 socket
        // 2. 绑定本地 ip + 本地 port（OS 分配）
        // 3. 连接远端 ip + 远端 port（127.0.0.1:9527)
        // 面向连接
        try (Socket socket = new Socket("127.0.0.1", 9527)) {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osWriter = new OutputStreamWriter(os, "UTF-8");
            PrintWriter printWriter = new PrintWriter(osWriter);

            printWriter.print("|发送一个请求|");
            printWriter.flush();
        }
    }
}
