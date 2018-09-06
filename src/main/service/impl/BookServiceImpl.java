package main.service.impl;

import main.dao.generic.BookDao;
import main.entity.Book;
import main.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao dao;

    @Override
    public void addBook(Book book) {
        dao.addElement(book);
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

}