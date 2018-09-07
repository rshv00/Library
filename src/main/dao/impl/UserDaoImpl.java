package main.dao.impl;


import main.dao.generic.UserDao;
import main.entity.User;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class UserDaoImpl extends GenericDaoImpl<User, Long>
        implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }

    @Deprecated
    @Override
    @SuppressWarnings("unchecked")
    public List<User> getDebtors() {
        Query query = sessionFactory
                .getCurrentSession()
                .createSQLQuery("select users.name, users.phone, users.birth_date, users.registration_date from (((records inner join users on " +
                        "users.user_id = records.user_id) inner join book_instances on book_instances.id = " +
                        "records.instance_id)inner join books on books.book_id = book_instances.book_id) " +
                        " where returned is null and (datediff(CURDATE(), taken) > 30);");
        return query.list();
    }

    @Override
    public int usingDays(int userId) {
        return 0;
    }

    @Override
    public User getUserByCredentials(String login, String pass) {
        Query query = sessionFactory
                .getCurrentSession()
                .createQuery("select u from User u where u.login =:login and u.pass= :pass");
        query.setParameter("login", login);
        query.setParameter("pass", pass);
        return (User) query.list().get(0);
    }
}
