package main.service;

import main.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookService {

    public void addBook(Book book);

    public void deleteBook(Book book);

    public List<Book> listBooks();

    public Book getBookById(Long id);

    public void updateBook(Book book);

    public List<Book> getTopBooks();

    public List<Book> getTopBooks(int days);

    public List<Book> getFlopBooks();

    public int bookTakenTimes(long id);

    public int avgAgeOfReaders(String bookName);

    public int avgReadTime(String bookName);

}
