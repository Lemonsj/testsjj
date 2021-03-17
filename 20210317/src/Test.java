import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-17
 * Time: 15:29
 **/
public class Test {
    public static void main1(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        /*File file = new File("D:\\CeShiDaiMa\\sunjie");
        System.out.println("生成对象，还未创建文件");

        scan.nextLine();

        System.out.println(file.createNewFile());
        System.out.println("文件创建成功");

        scan.nextLine();*/


        File file = new File("ttt");
        scan.nextLine();
        file.mkdir();
    }

    public static void main(String[] args) {
        String str = "D:\\CeShiDaiMa";

        File root = new File(str);

        深度遍历(root);
    }

    private static void 深度遍历(File root) {
        System.out.println(root.getAbsolutePath());

        if(root.isFile()) {
            return;
        }
        if(!root.isDirectory()) {
            return;
        }
        File[] files = root.listFiles();
        if(files == null) {
            return;
        }

        if(files.length == 0) {
            return;
        }

        for (File file : files) {
            深度遍历(file);
        }
    }
}
