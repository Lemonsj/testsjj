package com.operation;

import com.book.Book;
import com.book.BookList;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        System.out.println("输入要删除的书名:");
        //查找图书是否存在
        String name = scan.next();
        int i = 0;
        Book book = null;
        //遍历数组
        for (; i < bookList.getUsedSize(); i++) {
            book = bookList.getBook(i);
            if (book.getName().equals(name)) {
                break;
            }
        }
        if (i == bookList.getUsedSize()) {
            System.out.println("没有此书");
            return;
        }
        for (int j = i; j < bookList.getUsedSize() - 1; j++) {
            book = bookList.getBook(j + 1);
            bookList.setBooks(j, book);
        }
        int curSize = bookList.getUsedSize();
        bookList.setUsedSize(curSize - 1);
        System.out.println("删除成功！");
    }
}
