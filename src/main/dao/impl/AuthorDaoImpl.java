package main.dao.impl;


import main.dao.generic.AuthorDao;
import main.entity.Author;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class AuthorDaoImpl extends GenericDaoImpl<Author, Long>
        implements AuthorDao {

    public AuthorDaoImpl() {
        super(Author.class);
    }

    @Override
    public int getAvgAgeOfUsers(String authorName) {
        return 0;
    }
}
