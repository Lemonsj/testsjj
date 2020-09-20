import org.omg.CORBA.portable.OutputStream;

import java.io.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-19
 * Time: 19:47
 **/
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        try(java.io.OutputStream os = new FileOutputStream("加油中国.txt")) {
            /*os.write('H');
            os.write('e');
            os.write('l');
            os.write('l');
            os.write('o');
            os.write(0x0D);
            os.write(0x0A);

            os.flush();*/


            /*byte[] buffer = {'H','e','l','l','o',0x0D,0x0A};
            os.write(buffer,0,buffer.length);
            os.flush();*/


            /*String s = "你好中国";
            byte[] buffer = s.getBytes("UTF-8");
            os.write(buffer,0,buffer.length);
            os.flush();*/


            /*try(Writer writer = new OutputStreamWriter(os,"UTF-8")){
                writer.append("你好中国");
                writer.flush();
            }*/



            try(PrintWriter writer = new PrintWriter(new OutputStreamWriter(os,"UTF-8"))){
                for(int i = 0; i < 10; i++) {
                    writer.printf("%02d: 你好世界%n",i);
                }
                writer.flush();
            }
        }
    }
}
