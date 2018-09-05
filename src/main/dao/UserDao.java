package main.dao;


import main.entity.User;

public class UserDao extends GenericDaoImpl<User> {

    UserDao(Class<User> elementClass) {
        super(elementClass);
    }
}
