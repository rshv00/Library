package main.dao.impl;


import main.dao.generic.BookInstanceDao;
import main.entity.BookInstance;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Transactional
@Repository
public class BookInstanceDaoImpl extends GenericDaoImpl<BookInstance, Long>
        implements BookInstanceDao {

    public BookInstanceDaoImpl() {
        super(BookInstance.class);
    }


    @Override
    public int takenTimes(int id) {
        return 0;
    }

    @Override
    public HashMap<Long, Integer> takenTimes(String bookName) {
        return null;
    }


    @Override
    @SuppressWarnings("unchecked")
    public int countInstancesAfter1991() {
        List<Long> list = sessionFactory
                .getCurrentSession()
                .createQuery("select id from book_instances as bi where bi.editionYear>1991").list();
        return list.size();
    }

    @Override
    public List<BookInstance> getInstances(String bookName, int editionYear) {
        List<BookInstance> allInstances = getAllElements();
        List<BookInstance> sortedList = new ArrayList<>();

        for (BookInstance instance : allInstances) {
            if (instance.getBook().getName().equals(bookName) && instance.getEditionYear() == editionYear) {
                sortedList.add(instance);
            }
        }
        return sortedList;

    }

    @Override
    public boolean checkInstanceExist(String bookName, int editionYear) {
        List<BookInstance> allInstances = getAllElements();

        for (BookInstance instance : allInstances) {
            if (instance.getBook().getName().equals(bookName) && instance.getEditionYear() == editionYear) {
                return true;
            }
        }
        return false;

    }

    @Override
    public List<BookInstance> getInstances(String bookName) {
        List<BookInstance> allInstances = getAllElements();
        List<BookInstance> sortedList = new ArrayList<>();

        for (BookInstance instance : allInstances) {
            if (instance.getBook().getName().equals(bookName)) {
                sortedList.add(instance);
            }
        }
        return sortedList;

    }
}
