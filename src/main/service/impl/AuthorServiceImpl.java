package main.service.impl;

import main.dao.generic.AuthorDao;
import main.dao.impl.AuthorDaoImpl;
import main.entity.Author;
import main.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public abstract class AuthorServiceImpl implements AuthorService, AuthorDao {

    @Autowired
    AuthorDaoImpl dao;

    @Override
    public void addAuthor(Author author) {
        if(!dao.checkAuthorExist(author.getName()))
        dao.addElement(author);
    }

    @Override
    public void deleteAuthor(Author author) {
        dao.deleteElement(author);
    }

    @Override
    public List<Author> listAuthors() {
        return dao.getAllElements();
    }

    @Override
    public Author getAuthorById(Long id) {
        return dao.getElementById(id);
    }

    @Override
    public void updateAuthor(Author author) {
        dao.updateElement(author);
    }

    @Override
    public int getAvgAgeOfReaders(long authorId) {
        return dao.getAvgAgeOfReaders(authorId);
    }

}
