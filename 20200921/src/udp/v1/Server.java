package udp.v1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-21
 * Time: 20:27
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        //1、创建Server的Socket
        //内部会进行本地ip+port的绑定
        //例子：饭店开张，提供一个大家都认识的地段ip+port
        //ip虽然没传，内部会帮我们处理，把所有的ip都绑定

        try(DatagramSocket socket = new DatagramSocket(9939)) {

            //2、开门迎客，通过循环处理业务
            while(true) {
                //3、处理一个要求
                action(socket);
            }
        }
    }

    private static void action(DatagramSocket socket) throws IOException {
        //1、读取客户端发来的请求

        //1.1准备一个字节数组，用来以绘存放要读到的数据
        byte[] receiveBuffer = new byte[8192];
        //1.2把buffer封装成datagram
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer,0,8192);
        //1.3读取请求           开始准备接收
        socket.receive(receivePacket);
        //                     成功接收
        //1.4从receive中返回，就意味着有人给我发送请求了

        System.out.println(
                Arrays.toString(
                        Arrays.copyOfRange(receiveBuffer,0,receivePacket.getLength())
                )
        );

        //需要将byte[]中的数据进行字符集解码-》String
        String request = new String(receiveBuffer,0,receivePacket.getLength(),"UTF-8");
        System.out.printf("收到的请求是|%s|%n",request);
        //2、进行服务--根据请求，处理业务，并生成响应
        //Version1:回显服务--echo服务
        //你发送什么过来，我发送什么回去

        //Version2:字典查询服务--请求是英文，响应是中文+例句


        //String response = request;

        String response = translate(request);


        //3、发送响应回去
        byte[] sendBuffer = response.getBytes("UTF-8");
        DatagramPacket sendPacket = new DatagramPacket(
                sendBuffer,0,sendBuffer.length,
                receivePacket.getAddress(),
                receivePacket.getPort()
        );

        socket.send(sendPacket);

    }


    private static class Result {
        String chinese;
        String sentence;

        private Result(String chinese,String sentence) {
            this.chinese = chinese;
            this.sentence = sentence;
        }
    }
    private static Map<String,Result> dictionary = new TreeMap<>();

    static{
        dictionary.put("Sparlingly",new Result("adv. 很少;细嚼慢咽地; 节俭地;",
                "[例句] Sweeten dishes sparingly with honey, or concentrated apple or pear juice."));
        dictionary.put("chance",new Result("机会","We all have chance!"));
    }
    private static String translate(String english){
        Result result = dictionary.get(english);

        if(result == null) {
            return "不支持的单词";
        }
        return String.format(
                "%s%n%s%n",result.chinese,result.sentence
        );

    }
}
