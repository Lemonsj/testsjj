package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-28
 * Time: 17:01
 **/
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
    }
}
