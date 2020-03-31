import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
       /* {
            String path = "D:\\Javacode\\bittest\\20200330";
            File file = new File(path);
            System.out.println(file);
        }
        {
            String path = "D:\\Javacode\\bittest\\2020";
            File file = new File(path);
            System.out.println(file);
        }
        {
            String parent = "D:\\Javacode\\bittest";
            String path = "\\2021";
            File file = new File(parent,path);
            System.out.println(file);
        }*/

        {
            String parent = "D:\\Javacode\\bittest";
            String filename="即将拥有的世界.txt";
            File file = new File(parent,filename);
            System.out.println(file.exists());
            //创建文件
            boolean success = file.createNewFile();

            //创建文件夹  --》boolean success = file.mkdir();
            // mkdir = make directory
            if(success) {
                System.out.println(filename + "被创建成功");
            }else {
                System.out.println(filename + "已经存在");
            }
        }

        {
            String path="D:\\Javacode\\bittest\\20200330";
            File dir = new File(path);

            File[] files = dir.listFiles();
            //file == null;
            //file.length == 0;
            if(files != null) {
                for(File file : files) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
