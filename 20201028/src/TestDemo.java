import book.BookList;
import user.Admin;
import user.NormallUser;
import user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-28
 * Time: 17:18
 **/
public class TestDemo {

    public static User login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入姓名： ");
        String name = scan.nextLine();
        System.out.println("请输入你的身份： 1--》管理员，2--》普通用户");
        int choice = scan.nextInt();

        if(choice ==1) {
            return new Admin(name);
        }else {
            return new NormallUser(name);
        }
    }
    public static void main(String[] args) {
        //准备书籍
        BookList bookList = new BookList();

        //登录
        User user = login();
        int choice = user.menu();

        user.doOperation(choice,bookList);
    }
}
