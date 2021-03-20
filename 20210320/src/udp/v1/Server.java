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
 * Date: 2021-03-20
 * Time: 21:34
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        //开店
        try(DatagramSocket socket = new DatagramSocket(9939)) {
            //开门迎客
            while(true) {
                //处理业务
                action(socket);
            }
        }
    }

    private static void action(DatagramSocket socket) throws IOException {
        //接受请求
        byte[] recieveBuffer = new byte[8192];
        DatagramPacket recievePacket = new DatagramPacket(recieveBuffer,0,8192);
        socket.receive(recievePacket);

        /*System.out.println(
                Arrays.toString(
                        Arrays.copyOfRange(recieveBuffer,0,recievePacket.getLength())
                )

        );*/
        String request = new String(recieveBuffer,0,recievePacket.getLength(),"UTF-8");
        System.out.printf("收到的请求是 |%s|%n",request);


        //进行服务
        /*
        * 版本1：回显服务
        * */
        /*String response = request;*/

        /*
         * 版本2：字典查询服务
         * */

        String response = translate(request);
        //发送响应回去
        
        byte[] sendBuffer = response.getBytes("UTF-8");
        DatagramPacket sendPacket = new DatagramPacket(
                sendBuffer,0,sendBuffer.length,
                recievePacket.getAddress(),
                recievePacket.getPort()
        );
        socket.send(sendPacket);

    }

    private static class Result{
        String chinese;
        String sentence;
        private Result(String chinese,String sentence) {
            this.chinese = chinese;
            this.sentence = sentence;
        }
    }

    private static Map<String,Result> dictionary  = new TreeMap<>();
    static {
        dictionary.put("lianlian",new Result("谢怜","天官赐福"));
    }
    private static String translate(String english) {
        Result result = dictionary.get(english);
        if(result == null) {
            return "不支持的单词！";
        }
        return String.format("%s%n%s%n",result.chinese,result.sentence);
    }
}
