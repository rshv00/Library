package main.service.impl;

import main.dao.impl.BookInstanceDaoImpl;
import main.entity.BookInstance;
import main.service.BookInstanceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
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

    @Override
    public List<BookInstance> getInstances(String bookName) {
        List<BookInstance> allInstances = dao.getAllElements();
        List<BookInstance> sortedList = new ArrayList<>();

        for (BookInstance instance : allInstances) {
            if (instance.getBook().getName().equals(bookName)) {
                sortedList.add(instance);
            }
        }
        return sortedList;
    }

    @Override
    public List<BookInstance> getInstances(String bookName, int editionYear) {
        List<BookInstance> allInstances = dao.getAllElements();
        List<BookInstance> sortedList = new ArrayList<>();

        for (BookInstance instance : allInstances) {
            if (instance.getBook().getName().equals(bookName) && instance.getEditionYear() == editionYear) {
                sortedList.add(instance);
            }
        }
        return sortedList;

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
        List<BookInstance> allInstances = dao.getAllElements();
        List<BookInstance> sortedList = new ArrayList<>();

        for (BookInstance instance : allInstances) {
            if (instance.getBook().getName().equals(bookName) && instance.getEditionYear() == editionYear) {
                sortedList.add(instance);
            }
        }
        return !sortedList.isEmpty();
    }

    @Override
    public int countInstancesAfter1991() {
        return dao.countInstancesAfter1991();
    }
}
