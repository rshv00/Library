package main.dao.impl;


import main.dao.generic.UserDao;
import main.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Repository
@Transactional
public class UserDaoImpl extends GenericDaoImpl<User, Long, String>
        implements UserDao {

    public UserDaoImpl() {
        super(User.class);
    }

    @Override
    public long usingDays(long userId) {
        User user = getElementById(userId);

        LocalDate now = LocalDate.now();
        LocalDate registrationDate = user.getRegistration_date();

        return Math.abs(ChronoUnit.DAYS.between(now, registrationDate));
    }

    @Override
    public User getUserByCredentials(String login, String pass) {
        return getAllElements(login, pass).get(0);
    }
}
