package main.dao.generic;

import main.entity.User;

import java.util.List;

public interface UserDao extends GenericDao<User, Long> {

    /*
    * All users, who has not been returning as minimum as 1 book for more than 30 days */
    List<User> getDebtors();


}
