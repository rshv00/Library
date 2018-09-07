package main.service.impl;

import main.dao.generic.BookInstanceDao;
import main.dao.impl.BookInstanceDaoImpl;
import main.entity.BookInstance;
import main.service.BookInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


public abstract class BookInstanceServiceImpl implements BookInstanceService, BookInstanceDao {

    @Autowired
    BookInstanceDaoImpl dao;

    @Override
    public void addBookInstance(BookInstance instance) {
        instance.setAvailable(true);
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

    @Override
    public List<BookInstance> getInstances(String bookName) {
        return dao.getInstances(bookName);
    }

    @Override
    public List<BookInstance> getInstances(String bookName, int editionYear) {
        return dao.getInstances(bookName, editionYear);
    }

    @Override
    public int takenTimes(int id) {
        return dao.takenTimes(id);
    }

    @Override
    public HashMap<Long, Integer> takenTimes(String bookName) {
        return dao.takenTimes(bookName);
    }

    @Override
    public List<BookInstance> getAvailableInstances() {
        return null;
    }

    @Override
    public boolean checkInstanceExist(String bookName, int editionYear) {
        return dao.checkInstanceExist(bookName, editionYear);
    }

    @Override
    public int countInstancesAfter1991() {
        return dao.countInstancesAfter1991();
    }
}
