package main.dao.generic;

import main.entity.Author;

public interface AuthorDao extends GenericDao<Author, Long, Long> {

    boolean checkAuthorExist(String authorName);

}
