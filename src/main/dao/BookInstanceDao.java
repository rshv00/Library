package main.dao;


import main.entity.BookInstance;

public class BookInstanceDao extends GenericDaoImpl<BookInstance> {

    public BookInstanceDao(Class<BookInstance> elementClass) {
        super(elementClass);
    }

}
