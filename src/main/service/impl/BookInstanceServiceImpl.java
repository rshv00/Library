package main.service.impl;

import main.dao.generic.BookDao;
import main.dao.generic.BookInstanceDao;
import main.entity.Author;
import main.entity.Book;
import main.entity.BookInstance;
import main.service.BookInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BookInstanceServiceImpl implements BookInstanceService {

    @Autowired
    BookInstanceDao dao;
    @Autowired
    BookDao bookDao;

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
    public void updateBookInstance(BookInstance instance) {
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

    @Override
    public void updateBookInfo(long instanceId, String bookName, String coauthor, int editionYear, Set<Author> authors) {
        BookInstance instance = getBookById(instanceId);
        instance.setEditionYear(editionYear);
        Book book = instance.getBook();
        book.setAuthors(authors);
        book.setName(bookName);
        bookDao.updateElement(book);
        updateBookInstance(instance);
    }
}
