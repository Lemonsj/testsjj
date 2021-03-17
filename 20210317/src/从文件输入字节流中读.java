import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-17
 * Time: 16:36
 **/
public class 从文件输入字节流中读 {

    public static void main(String[] args) throws IOException {
        try(InputStream is = new FileInputStream("练习.png")) {
            /*long len = 0;
            while (true) {
                int b = is.read();
                if(b == -1) {
                    break;
                }

                len++;
            }

            System.out.printf("图片的长度为%d字节%n",len);*/

            byte[] buffer = new byte[1024];
            int count = 0;
            int len = 0;
            while(true) {
                count++;
                int read = is.read(buffer);

                if(read == -1) {
                    break;
                }
                len += read;
            }
        }
    }
}
