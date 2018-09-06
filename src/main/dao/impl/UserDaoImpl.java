package main.dao.impl;


import main.dao.generic.UserDao;
import main.entity.User;

import java.util.List;

public class UserDaoImpl extends GenericDaoImpl<User, Long>
        implements UserDao {

    UserDaoImpl(Class<User> elementClass) {
        super(elementClass);
    }

    @Override
    public List<User> getDebtors() {
        return null;
    }
}
