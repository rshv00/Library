package com.edu.library.dao;


import com.edu.library.entity.User;

public class UserDao extends GenericDaoImpl<User> {

    UserDao(Class<User> elementClass) {
        super(elementClass);
    }
}
