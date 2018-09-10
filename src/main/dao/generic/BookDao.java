package main.dao.generic;

import main.entity.Book;

import java.util.List;
import java.util.Map;

public interface BookDao extends GenericDao<Book, Long, Integer> {

    /**
     * @return 10 most taken books by period in days. In case  parameter days = 0 returns most taken books by all time
     */
    List<Book> getTopBooks(int days);

    /**
     * @return Flop books were taken as minimum once
     */
    List<Book> getFlopBooks();


    List<Book> getAllBooks(long authorId);

    /**
     * @param bookId
     * @return Map with InstanceID, TakenTimes
     */
    Map<Long, Integer> getBookTakenTimesByEachInstance(long bookId);

    /**
     * @return Book taken times
     */
    int getBookTakenTimes(long id);

    /**
     * @return Average age of readers by book name
     **/
    int getAvgAgeOfReaders(long bookId);

    /**
     * @param bookId
     * @return Average reading time
     */
    int getAvgReadTime(long bookId);

    /**
     * @param bookId
     * @return true if book exists
     */
    boolean checkBookExists(long bookId);

}
