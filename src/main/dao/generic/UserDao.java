package main.dao.generic;

import main.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserDao extends GenericDao<User, Long> {

    /*
     * All users, who has not been returning as minimum as 1 book for more than 30 days */
    List<User> getDebtors();

    /*
     * Number of days after registration of user
     * */
    int usingDays(int userId);

    /*
    * Get user by login and pass
    * */
    User getUserByCredentials(String login, String pass);

}
