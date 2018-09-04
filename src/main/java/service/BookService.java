package service;

import dao.BookDao;
import dao.DaoFactory;
import entity.Book;

import java.util.List;

public class BookService {

    private BookDao bookDao() {
        return DaoFactory.getInstance().getBookDao();
    }

    public void addBook(Book book) {
        bookDao().addElement(book);
    }

    public void deleteBook(Book book) {
        bookDao().deleteElement(book);
    }

    public List<Book> listBooks() {
        return bookDao().getAllElements();
    }

    public Book getBookById(Long id) {
        return bookDao().getElementById(id);
    }


}
