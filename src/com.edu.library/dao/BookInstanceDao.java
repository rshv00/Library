package com.edu.library.dao;


import com.edu.library.entity.BookInstance;

public class BookInstanceDao extends GenericDaoImpl<BookInstance> {

    public BookInstanceDao(Class<BookInstance> elementClass) {
        super(elementClass);
    }

}
