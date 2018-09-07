package main.dao.impl;

import main.dao.generic.BookDao;
import main.entity.Book;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book, Long>
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
    public int avgAgeOfUsers(String bookName) {
        return 0;
    }

    @Override
    public int avgReadTime(String bookName) {
        return 0;
    }
}
