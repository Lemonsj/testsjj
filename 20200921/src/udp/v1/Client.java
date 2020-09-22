package udp.v1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-21
 * Time: 20:55
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        try(DatagramSocket socket = new DatagramSocket()) {
            while(true) {
                //读取用户输入
                System.out.println("随便输入什么然后回车>");
                //scan.nextLine();

                String input = scan.nextLine();

                //发送请求
                byte[] sendBuffer = input.getBytes("UTF-8");
                DatagramPacket sendPacket = new DatagramPacket(
                        sendBuffer,0,sendBuffer.length,
                        InetAddress.getByName("127.0.0.1"),
                        9939
                );
                socket.send(sendPacket);
                //接收响应的过程
                byte[] receiveBuffer = new byte[8192];
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer,0,receiveBuffer.length);
                socket.receive(receivePacket);
                //真正接收到响应，进行字符集解码
                String response = new String(receiveBuffer,0,receivePacket.getLength(),"UTF-8");
                System.out.printf("From服务器$|%s|%n",response);


            }
        }
    }
}
