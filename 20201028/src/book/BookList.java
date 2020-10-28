package book;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-10-28
 * Time: 16:25
 **/
public class BookList {
    private Book[] books = new Book[100];
    private int usedSize;

    public void setBooks(int pos, Book book) {
        books[pos] = book;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public BookList() {
        books[0] = new Book("二十不惑","慕白",45,"小说");
        books[1] = new Book("三十而已","南枝",55,"小说");
        books[2] = new Book("琉璃","筱筱",35,"小说");

    }


}
