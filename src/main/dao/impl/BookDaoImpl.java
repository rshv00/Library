package main.dao.impl;

import main.dao.generic.BookDao;
import main.dao.generic.BookInstanceDao;
import main.dao.generic.RecordDao;
import main.entity.Book;
import main.entity.BookInstance;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Repository
public class BookDaoImpl extends GenericDaoImpl<Book, Long, Integer>
        implements BookDao {

    @Autowired
    BookInstanceDao biDao;
    @Autowired
    RecordDao rDao;

    public BookDaoImpl() {
        super(Book.class);
    }


    @SuppressWarnings("unchecked")
    @Override
    public List<Book> getTopBooks(int days) {
        List<Book> sortedBooks;
        if (days == 0) {
            sortedBooks = sessionFactory
                    .getCurrentSession()
                    .createQuery("from Book b inner join BookInstance bi inner join Record r group by count(r.taken)")
                    .setMaxResults(10)
                    .list();
        } else {
            sortedBooks = sessionFactory
                    .getCurrentSession()
                    .createSQLQuery("select books.name from(" +
                            "(book_instances inner join records on records.instance_id = book_instances.id)" +
                            "inner join books on book_instances.book_id=books.book_id)" +
                            " where datediff(curdate(), records.taken)<" + days +
                            " group by taken order by count(records.instance_id) desc limit 10;")
                    .list();
        }
        return sortedBooks;
    }

    @Override
    public List<Book> getFlopBooks() {
        return null;
    }


    @Override
    public int getBookTakenTimes(long id) {
        Book book = getElementById(id);

        Query query =
                sessionFactory
                        .getCurrentSession()
                        .createQuery("select count(Record.instance) from Record inner join BookInstance bi where bi.book =:book");
        query.setParameter("book", book);

        return (int) query.list().get(0);
    }

    @SuppressWarnings("unchecked")
    @Override
    public Map<Long, Integer> getBookTakenTimesByEachInstance(long bookId) {

        List<BookInstance> instances = sessionFactory
                .getCurrentSession()
                .createQuery("from BookInstance bi join Book b where b.id=:id")
                .setParameter("id", bookId)
                .list();

        Map<Long, Integer> instancesTakenTimes = new HashMap<>();
        for (BookInstance instance : instances) {
            long id = instance.getId();
            instancesTakenTimes.put(id, biDao.getTakenTimes(id));
        }
        return instancesTakenTimes;
    }

    @Override
    public int getAvgAgeOfReaders(long bookId) {
        return 0;
    }

    @Override
    public int getAvgReadTime(long bookId) {
        return 0;
    }

    @Override
    public boolean checkBookExists(long bookId) {
        List<Book> allBooks = getAllElements();

        for (Book book : allBooks) {
            if (book.getId() == bookId) {
                return true;
            }
        }
        return false;
    }

}
