package main.dao.impl;

import main.dao.generic.BookDao;
import main.entity.Book;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;


@EnableAspectJAutoProxy(proxyTargetClass = true)
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book, Long>
        implements BookDao {

    public BookDaoImpl() {
        super(Book.class);
    }

}
