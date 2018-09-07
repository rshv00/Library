package main.service.impl;

import main.dao.impl.UserDaoImpl;
import main.entity.User;
import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDaoImpl dao;

    @Override
    public void addUser(User user) {
        dao.addElement(user);
    }

    @Override
    public void deleteUser(User user) {
        dao.deleteElement(user);
    }

    @Override
    public List<User> listUsers() {
        return dao.getAllElements();
    }

    @Override
    public User getUserById(Long id) {
        return dao.getElementById(id);
    }

    @Override
    public void updateUser(User user) {
        dao.updateElement(user);
    }

    @Override
    public int usingDays(int userId) {
        return dao.usingDays(userId);
    }

    @Override
    public User getUserByCredentials(String login, String pass) {
        return dao.getUserByCredentials(login, pass);
    }

    @Override
    public List<User> getDebtors() {
        return dao.getDebtors();
    }


}
