package main.dao.impl;


import main.entity.Author;

public class AuthorDaoImpl extends GenericDaoImpl<Author, Long> {

    public AuthorDaoImpl(Class<Author> elementClass) {
        super(elementClass);
    }
}
