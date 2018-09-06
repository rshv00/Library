package main.service.impl;

import main.dao.impl.AuthorDaoImpl;
import main.entity.Author;
import main.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorDaoImpl dao;

    @Override
    public void addAuthor(Author author) {
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
}
