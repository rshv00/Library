package main.service.impl;

import main.dao.generic.BookInstanceDao;
import main.entity.BookInstance;
import main.service.BookInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookInstanceServiceImpl implements BookInstanceService {

    @Autowired
    BookInstanceDao dao;

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
    public int getTakenTimes(long id) {
        return dao.getTakenTimes(id);
    }

    @Override
    public List<BookInstance> getAvailableInstances() {
        return dao.getAvailableInstances();
    }

    @Override
    public boolean checkInstanceExist(String bookName, int editionYear) {
        return dao.checkInstanceExist(bookName, editionYear);
    }

    @Override
    public int getCountInstancesAfter1991() {
        return dao.countInstancesAfter1991();
    }
}
