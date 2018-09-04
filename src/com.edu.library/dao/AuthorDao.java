package com.edu.library.dao;


import com.edu.library.entity.Author;

public class AuthorDao extends GenericDaoImpl<Author> {

    public AuthorDao(Class<Author> elementClass) {
        super(elementClass);
    }
}
