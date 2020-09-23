package udp.v1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-22
 * Time: 15:56
 **/
public class Client {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        try(DatagramSocket socket = new DatagramSocket()) {
            while(true) {
                System.out.println("随便输入什么然后回车》");
                String input = scan.nextLine();

                //发送请求
                byte[] sendBuffer = input.getBytes("UTF-8");

                DatagramPacket sendPacket = new DatagramPacket(sendBuffer,0,sendBuffer.length,
                        InetAddress.getByName("127.0.0.1"),
                        9939
                );
                socket.send(sendPacket);

                //接收响应
                byte[] receiveBuffer = new byte[8192];
                DatagramPacket receivePacket = new DatagramPacket(receiveBuffer,0,receiveBuffer.length);
                socket.receive(receivePacket);

                String response = new String(receiveBuffer,0,receivePacket.getLength());
                System.out.printf("From服务器|%s|%n",response);
            }
        }
    }
}
