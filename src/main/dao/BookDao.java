package main.dao;

import main.entity.Book;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;


@EnableAspectJAutoProxy(proxyTargetClass = true)
@Repository
public class BookDao extends GenericDaoImpl<Book> {

    public BookDao() {
        super(Book.class);
    }

}
