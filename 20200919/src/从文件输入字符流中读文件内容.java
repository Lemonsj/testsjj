import java.io.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-19
 * Time: 18:57
 **/
public class 从文件输入字符流中读文件内容 {
    public static void main(String[] args) throws IOException {
        try(InputStream is = new FileInputStream("有中文的文件.txt")) {
            try(Reader reader = new InputStreamReader(is,"UTF-8")) {
               /* StringBuilder sb = new StringBuilder();
                while(true) {
                    int c = reader.read();
                    if(c == -1) {
                        break;
                    }

                    sb.append((char)c);
                }
                System.out.println(sb.toString());*/
                StringBuilder sb = new StringBuilder();
                char[] buffer = new char[10];
                while(true) {
                    int len = reader.read(buffer);
                    if(len == -1) {
                        break;
                    }
                    sb.append(buffer,0,len);
                }
                System.out.println(sb.toString());
            }

        }

    }


}
