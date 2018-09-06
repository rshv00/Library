package main.dao.impl;


import main.entity.BookInstance;
import org.springframework.stereotype.Repository;

@Repository
public class BookInstanceDaoImpl extends GenericDaoImpl<BookInstance, Long> {

    public BookInstanceDaoImpl() {
        super(BookInstance.class);
    }

}
