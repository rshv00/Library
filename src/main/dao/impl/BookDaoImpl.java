package main.dao.impl;

import main.dao.generic.BookDao;
import main.entity.Book;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book, Long, Integer>
        implements BookDao {

    public BookDaoImpl() {
        super(Book.class);
    }

    @Override
    public List<Book> getTopBooks() {
        return null;
    }

    @Override
    public List<Book> getTopBooks(int days) {
        return null;
    }

    @Override
    public List<Book> getFlopBooks() {
        return null;
    }


    @Override
    public int bookTakenTimes(long id) {
        return 0;
    }

    @Override
    public int avgAgeOfReaders(String bookName) {
        return 0;
    }

    @Override
    public int avgReadTime(String bookName) {
        return 0;
    }

    @Override
    public boolean checkBookExists(String bookName) {
        List<Book> allBooks = getAllElements();

        for (Book book : allBooks) {
            if (book.getName().equals(bookName)){
                return true;
            }
        }
        return false;
    }

}
