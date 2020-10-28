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
public class Admin extends User {

    public Admin(String name) {
        super(name);//显示的调用父类的构造方法，帮助父类进行构造
        this.operations = new IOperation[] {
                new ReturnOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()

        };
    }

    @Override
    public int menu() {
        System.out.println("🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱");
        System.out.println("hello " + this.name + " 欢迎来到图书管理系统");
        System.out.println("0、退出系统");
        System.out.println("1、查找系统");
        System.out.println("2、新增图书");
        System.out.println("3、删除图书");
        System.out.println("4、显示所有图书");
        System.out.println("🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;

    }
}
