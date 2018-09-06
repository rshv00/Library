package main.dao.impl;

import main.dao.generic.BookDao;
import main.entity.Book;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;

import java.util.List;


@EnableAspectJAutoProxy(proxyTargetClass = true)
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book, Long>
        implements BookDao {

    public BookDaoImpl() {
        super(Book.class);
    }

    @Override
    public List<Book> getTopBooks() {
        return ;
    }

    @Override
    public List<Book> getTopBooks(int days) {
        return ;
    }

    @Override
    public List<Book> getFlopBooks() {
        return ;
    }


    @Override
    public int bookTakenTimes(long id) {
        return ;
    }

    @Override
    public int avgAgeOfUsers(String bookName) {
        return ;
    }

    @Override
    public int avgReadTime(String bookName) {
        return ;
    }
}
