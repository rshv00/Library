package main.service;

import main.entity.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    public void deleteUser(User user);

    public List<User> listUsers();

    public User getUserById(Long id);

    public void updateUser(User user);
}
