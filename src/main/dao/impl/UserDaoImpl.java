package main.dao.impl;


import main.dao.generic.UserDao;
import main.entity.User;
import org.hibernate.Criteria;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class UserDaoImpl extends GenericDaoImpl<User, Long>
        implements UserDao {

    UserDaoImpl(Class<User> elementClass) {
        super(elementClass);
    }

    @Override
    public List<User> getDebtors() {
        return ;
    }

    @Override
    public int usingDays(int userId) {
        return ;
    }

    @Override
    public User getUserByCredentials(String login, String pass) {
        Query query = sessionFactory
                .getCurrentSession()
                .createQuery("select u from User u where u.login =:login and u.pass= :pass");
        query.setFetchSize(1);
        query.setParameter("login", login);
        query.setParameter("pass", pass);
        return (User) query.list();
    }
}
