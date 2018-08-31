package service;

import dao.BookDao;
import dao.DaoFactory;
import entity.Book;

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


}
