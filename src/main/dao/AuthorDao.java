package main.dao;


import main.entity.Author;

public class AuthorDao extends GenericDaoImpl<Author> {

    public AuthorDao(Class<Author> elementClass) {
        super(elementClass);
    }
}
