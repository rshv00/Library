package main.service;

import main.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    public void addBook(Book book);

    public void deleteBook(Book book);

    public List<Book> listBooks();

    public Book getBookById(Long id);

    public void updateBook(Book book);

    /*
     * Most taken books
     * */
    List<Book> getTopBooks();

    /*
     * Most taken books by period in days
     * */
    List<Book> getTopBooks(int days);

    /*
     * Flop books, were taken as minimum once
     * */
    List<Book> getFlopBooks();

    /*
     * Book taken times
     * */
    int bookTakenTimes(long id);

    /*
     * Average age of readers by book name
     **/
    int avgAgeOfReaders(String bookName);

    /*
     * Average reading time
     * */
    int avgReadTime(String bookName);

    boolean checkBookExists(String bookName);

}
