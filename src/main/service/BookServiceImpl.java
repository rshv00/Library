package main.service;

import main.dao.BookDao;
import main.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDAO;

    public BookServiceImpl(BookDao bookDAO) {
        this.bookDAO = bookDAO;
    }
    @Override
    public void addBook(Book book) {
        bookDAO.addElement(book);
    }
    @Override
    public void deleteBook(Book book) {
        bookDAO.deleteElement(book);
    }
    @Override
    public List<Book> listBooks() {
        return bookDAO.getAllElements();
    }
    @Override
    public Book getBookById(Long id) {
        return bookDAO.getElementById(id);
    }
}
