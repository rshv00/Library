package main.dao.generic;

import main.entity.User;
public interface UserDao extends GenericDao<User, Long, String> {

    /*
     * Number of days after registration of user
     * */
    long usingDays(long userId);

    /*
    * Get user by login and pass
    * */
    User getUserByCredentials(String login, String pass);

}
