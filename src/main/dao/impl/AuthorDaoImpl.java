package main.dao.impl;


import main.dao.generic.AuthorDao;
import main.entity.Author;
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
