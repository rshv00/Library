package main.service.impl;

import main.dao.generic.BookDao;
import main.entity.Book;
import main.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao dao;

    @Override
    public void addBook(Book book) {
        if (!dao.checkBookExists(book.getId())) {
            dao.addElement(book);
        }
    }

    @Override
    public void deleteBook(Book book) {
        dao.deleteElement(book);
    }

    @Override
    public List<Book> listBooks() {
        return dao.getAllElements();
    }

    @Override
    public Book getBookById(Long id) {
        return dao.getElementById(id);
    }

    @Override
    public void updateBook(Book book) {
        dao.updateElement(book);
    }

    @Override
    public List<Book> getTopBooks(int days) {
        return dao.getTopBooks(days);
    }

    @Override
    public List<Book> getFlopBooks() {
        return dao.getFlopBooks();
    }

    @Override
    public List<Book> getAllBooks(long authorId) {
        return dao.getAllBooks(authorId);
    }

    @Override
    public int getBookTakenTimes(long id) {
        return dao.getBookTakenTimes(id);
    }

    @Override
    public Map<Long, Integer> getBookTakenTimesByEachInstance(long bookId) {
        return dao.getBookTakenTimesByEachInstance(bookId);
    }

    @Override
    public int getAvgAgeOfReaders(long bookId) {
        return dao.getAvgAgeOfReaders(bookId);
    }

    @Override
    public int getAvgReadTime(long bookId) {
        return dao.getAvgReadTime(bookId);
    }

    @Override
    public boolean checkBookExists(long bookId) {
        return dao.checkBookExists(bookId);
    }



}
