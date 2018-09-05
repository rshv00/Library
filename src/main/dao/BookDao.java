package main.dao;

import main.entity.Book;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
public class BookDao extends GenericDaoImpl<Book> {

    public BookDao() {
        super(Book.class);
    }

}
