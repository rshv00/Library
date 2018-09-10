package main.service;

import main.entity.Book;

import java.util.List;
import java.util.Map;

public interface BookService {

    public void addBook(Book book);

    public void deleteBook(Book book);

    public List<Book> listBooks();

    public Book getBookById(Long id);

    public void updateBook(Book book);

    /*
     * Most taken books by period in days
     * */
    List<Book> getTopBooks(int days);

    /*
     * Flop books, were taken as minimum once
     * */
    List<Book> getFlopBooks();

    List<Book> getAllBooks(long authorId);

    /*
     * Book taken times
     * */
    int getBookTakenTimes(long id);

    /**
     * @param bookId
     * @return Map with InstanceID, TakenTimes
     */
    Map<Long, Integer> getBookTakenTimesByEachInstance(long bookId);

    /*
     * Average age of readers by book name
     **/
    int getAvgAgeOfReaders(long bookId);

    /*
     * Average reading time
     * */
    int getAvgReadTime(long bookId);

    boolean checkBookExists(long bookId);


}
