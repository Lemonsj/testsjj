package udp.v1;

import javax.sql.DataSource;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-20
 * Time: 21:47
 **/
public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try(DatagramSocket socket = new DatagramSocket()) {
            while(true) {
                System.out.println("随便输入什么然后回车");
                /*scanner.nextLine();

                byte[] sendBuffer = {9,5,2,7};*/
                String input = scanner.nextLine();
                byte[] sendBuffer = input.getBytes("UTF-8");
                DatagramPacket sendPacket = new DatagramPacket(
                        sendBuffer,0,sendBuffer.length,
                        InetAddress.getByName("127.0.0.1"),
                        9939
                );
                socket.send(sendPacket);
                byte[] recieveBuffer = new byte[8192];
                DatagramPacket recievePacket = new DatagramPacket(recieveBuffer,0,recieveBuffer.length);

                socket.receive(recievePacket);

                String response = new String(recieveBuffer,0,recievePacket.getLength(),"UTF-8");
                System.out.printf("接收到的响应是 |%s|%n",response);
            }
        }
    }
}
