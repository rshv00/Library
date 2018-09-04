package dao;

import entity.User;

public class UserDao extends GenericDaoImpl<User> {

    UserDao(Class<User> elementClass) {
        super(elementClass);
    }
}
