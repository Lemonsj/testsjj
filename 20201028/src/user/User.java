package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-28
 * Time: 17:13
 **/
public abstract  class User {
    protected String name;

    protected IOperation[] operations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        this.operations[choice].work(bookList);
    }
}
