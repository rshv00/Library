package main.dao.impl;


import main.dao.generic.BookInstanceDao;
import main.entity.BookInstance;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class BookInstanceDaoImpl extends GenericDaoImpl<BookInstance, Long>
        implements BookInstanceDao {

    public BookInstanceDaoImpl() {
        super(BookInstance.class);
    }

    @Override
    public List<BookInstance> getInstances(String bookName) {
        return;
    }

    @Override
    public int takenTimes(int id) {
        return;
    }

    @Override
    public HashMap<Long, Integer> takenTimes(String bookName) {
        return;
    }

    @Override
    public List<BookInstance> getAvailableInstances() {
        return;
    }

    @Override
    @SuppressWarnings("unchecked")
    public int countInstancesAfter1991() {
        List<Long> list = sessionFactory
                .getCurrentSession()
                .createQuery("select id from BookInstance as bi where bi.editionYear>1991").list();
        return list.size();
    }
}
