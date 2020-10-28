package user;

import operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-28
 * Time: 17:10
 **/
public class NormallUser extends User {
    public NormallUser(String name) {
        super(name);
        this.operations = new IOperation[] {
                new ReturnOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()

        };
    }

    @Override
    public int menu() {
        System.out.println("🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱");
        System.out.println("hello " + this.name + " 欢迎来到图书管理系统");
        System.out.println("0、退出系统");
        System.out.println("1、查找图书");
        System.out.println("2、借阅图书");
        System.out.println("3、归还图书");
        System.out.println("🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;

    }
}
