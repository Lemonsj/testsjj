package tcp2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 一个连接中有多个请求
// 长连接 + 根据 \r\n 来分割请求和响应
public class Server {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8192)) {
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    System.out.println("======================================");
                    System.out.println("有一个客户端连接上来了");
                    InputStream is = socket.getInputStream();
                    InputStreamReader isReader = new InputStreamReader(is, "UTF-8");
                    Scanner scanner = new Scanner(isReader);
                    // 没有 scanner，需要收到找 \r\n，麻烦的很

                    // 一个连接可以发送多个请求
                    while (scanner.hasNextLine()) {
                        String request = scanner.nextLine();
                        System.out.println("++++++++++++++++++");
                        System.out.println(request);
                        System.out.println("++++++++++++++++++");
                    }

                    System.out.println("======================================");
                }
            }
        }
    }
}
