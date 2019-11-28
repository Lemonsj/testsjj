package com.book;

public class BookList {
    private Book[] books = new Book[10];
    private int usedSize;

    public void setBooks(int pos,Book book) {
        books[pos] = book;
    }

    public Book getBook(int pos) {
        return books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public BookList() {
        books[0] = new Book("时生","东野硅谷",45,"小说");
        books[1] = new Book("不要等到毕业以后","张志",34,"小说");
        books[2] = new Book("西游记","吴承恩",76,"小说");

    }

}
