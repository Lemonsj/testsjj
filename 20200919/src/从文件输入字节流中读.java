import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-19
 * Time: 17:55
 **/
public class 从文件输入字节流中读 {

    public static void main(String[] args) throws IOException {
        try(InputStream is = new FileInputStream("mubai.txt")) {
            //b的意思有两个：1、下一个字节；2、标志把文件读完了（End Of Stream）  \r\n换行符不是EOS
            /*long len = 0;
            while(true) {
                int b = is.read();
                if(b == -1) {
                    break;
                }
                len++;
            }
            System.out.printf("mubai.txt的文件长度为%d字节%n",len);*/

            byte[] buffer = new byte[1024];
            long len = 0;
            long count = 0;

            while(true) {
                count++;
                int read = is.read(buffer);

                if(read == -1) {
                    break;
                }

                len += read;
            }

            System.out.printf("循环 %d 次%n",count);
            System.out.printf("mubai.txt的文件长度%d字节%n",len);


        }




    }
}
