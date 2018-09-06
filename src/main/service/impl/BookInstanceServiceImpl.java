package main.service.impl;

import main.dao.impl.BookInstanceDaoImpl;
import main.entity.BookInstance;
import main.service.BookInstanceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookInstanceServiceImpl implements BookInstanceService {

    @Autowired
    BookInstanceDaoImpl dao;

    @Override
    public void addBookInstance(BookInstance instance) {
        dao.addElement(instance);
    }

    @Override
    public void deleteBookInstance(BookInstance instance) {
        dao.deleteElement(instance);
    }

    @Override
    public List<BookInstance> listBooks() {
        return dao.getAllElements();
    }

    @Override
    public BookInstance getBookById(Long id) {
        return dao.getElementById(id);
    }

    @Override
    public void updateBook(BookInstance instance) {
        dao.updateElement(instance);
    }
}
