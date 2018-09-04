package com.edu.library.dao;

import com.edu.library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
public class BookDao extends GenericDaoImpl<Book> {

    public BookDao() {
        super(Book.class);
    }

}
