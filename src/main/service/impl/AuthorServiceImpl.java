package main.service.impl;

import main.dao.generic.AuthorDao;
import main.entity.Author;
import main.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorDao dao;

    @Override
    public void addAuthor(Author author) {
        if (!dao.checkAuthorExist(author.getName()))
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
    public boolean checkAuthorExist(String authorName) {
        return dao.checkAuthorExist(authorName);
    }

}
