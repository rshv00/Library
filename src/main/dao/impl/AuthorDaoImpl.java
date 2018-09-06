package main.dao.impl;


import main.dao.generic.AuthorDao;
import main.entity.Author;

public class AuthorDaoImpl extends GenericDaoImpl<Author, Long>
        implements AuthorDao {

    public AuthorDaoImpl(Class<Author> elementClass) {
        super(elementClass);
    }

    @Override
    public int getAvgAgeOfUsers(String authorName) {
        //TODO
        return sessionFactory.getCurrentSession().createQuery() ;
    }
}
