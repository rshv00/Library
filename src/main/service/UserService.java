package main.service;

import main.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserService {

    public void addUser(User user);

    public void deleteUser(User user);

    public List<User> listUsers();

    public User getUserById(Long id);

    public void updateUser(User user);

    public int usingDays(int userId);

    public User getUserByCredentials(String login, String pass);
}
