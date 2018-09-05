package main.service;

import main.dao.BookDao;
import main.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("Prototype")
public class BookService {

    @Autowired
    private BookDao bookDAO;

    public BookService(BookDao bookDAO) {
        this.bookDAO = bookDAO;
    }

    public void addBook(Book book) {
        bookDAO.addElement(book);
    }

    public void deleteBook(Book book) {
        bookDAO.deleteElement(book);
    }

    public List<Book> listBooks() {
        return bookDAO.getAllElements();
    }

    public Book getBookById(Long id) {
        return bookDAO.getElementById(id);
    }


}
