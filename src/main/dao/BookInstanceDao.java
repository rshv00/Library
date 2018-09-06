package main.dao;


import main.entity.BookInstance;
import org.springframework.stereotype.Repository;

@Repository
public class BookInstanceDao extends GenericDaoImpl<BookInstance> {

    public BookInstanceDao() {
        super(BookInstance.class);
    }

}
