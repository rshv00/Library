package main.dao.generic;

import main.entity.Author;

public interface AuthorDao extends GenericDao<Author, Long, Long> {

    /*
     * Avg age of users by author
     * */
     int getAvgAgeOfReaders(long authorId);

    boolean checkAuthorExist(String authorName);

}
