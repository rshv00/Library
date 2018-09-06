package main.service;

import main.entity.Book;

import java.util.List;

public interface BookService {

    public void addBook(Book book);

    public void deleteBook(Book book);

    public List<Book> listBooks();

    public Book getBookById(Long id);

    public void updateBook(Book book);
}
