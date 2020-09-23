package udp.v1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-22
 * Time: 15:56
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        //创建Server的Socket
        try(DatagramSocket socket = new DatagramSocket(9939)) {
            //开店营业
            while(true) {
                action(socket);
            }
        }
    }

    private static void action(DatagramSocket socket) throws IOException {
        byte[] receiveBuffer = new byte[8192];
        DatagramPacket receivePacket = new DatagramPacket(
                receiveBuffer,0,8192
        );
        //开始准备接收
        socket.receive(receivePacket);
        String request = new String(
                receiveBuffer,0,receivePacket.getLength()
        );
        System.out.printf("收到的请求是|%s|%n",request);
        //收到的请求是|慕白|


        //生成响应
        String response = request;
        byte[] sendBuffer = response.getBytes("UTF-8");
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer,0,sendBuffer.length,
                receivePacket.getAddress(),
                receivePacket.getPort()
        );
        socket.send(sendPacket);

    }
}
