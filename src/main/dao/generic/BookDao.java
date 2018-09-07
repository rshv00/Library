package main.dao.generic;

import main.entity.Book;

import java.util.List;

public interface BookDao extends GenericDao<Book, Long> {

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
    int avgAgeOfUsers(String bookName);

    /*
     * Average reading time
     * */
    int avgReadTime(String bookName);

    boolean checkBookExists(String bookName);

}
