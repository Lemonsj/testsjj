import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-19
 * Time: 18:25
 **/
public class 从文件输入字节流中读文本内容 {
    public static void main(String[] args) throws IOException {
        try(InputStream is = new FileInputStream("没有中文的文件.txt")){
            byte[] buffer = new byte[1024];

            int len = is.read(buffer);
            System.out.println(len);
            System.out.println("++++++++++++++");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                //System.out.println((char)buffer[i]);
                sb.append((char)buffer[i]);
            }


            String s = sb.toString();
            System.out.println(s);
        }

    }
}
