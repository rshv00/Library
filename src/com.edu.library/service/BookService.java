package com.edu.library.service;

import com.edu.library.dao.BookDao;
import com.edu.library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookService bookService;

    private BookDao bookDAO;

    @Autowired
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
