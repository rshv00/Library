package main.dao.impl;


import main.dao.generic.AuthorDao;
import main.entity.Author;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class AuthorDaoImpl extends GenericDaoImpl<Author, Long, Long>
        implements AuthorDao {

    public AuthorDaoImpl() {
        super(Author.class);
    }


    @Override
    public int getAvgAgeOfReaders(long authorId) {
        Query query = sessionFactory
                .getCurrentSession()
                .createQuery(
                        "select User.birth_date from Record r " +
                                "inner join BookInstance bi on bi.id=r.instance.id" +
                                " inner join User u on u.id=r.user.id" +
                                " inner join Book b on b.id = bi.book.id ");

        System.out.println(query.list().toString());
        return 0;
    }

    @Override
    public boolean checkAuthorExist(String authorName) {
        List<Author> allAuthors = getAllElements();

        for (Author author : allAuthors) {
            if (author.getName().equals(authorName)) {
                return true;
            }
        }
        return false;
    }
}
