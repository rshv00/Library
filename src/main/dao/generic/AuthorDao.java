package main.dao.generic;

public interface AuthorDao {

    /*
     * Avg age of users by author
     * */
    int getAvgAgeOfUsers(String authorName);

    boolean checkAuthorExist(String authorName);

}
