package main.dao.impl;


import main.dao.generic.BookInstanceDao;
import main.entity.BookInstance;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    public List<BookInstance> getInstances(String bookName) {
        return null;
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
    public List<BookInstance> getAvailableInstances() {
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
}
