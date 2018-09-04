package dao;

import entity.Author;

public class AuthorDao extends GenericDaoImpl<Author> {

    public AuthorDao(Class<Author> elementClass) {
        super(elementClass);
    }
}
