package main.service;

import main.entity.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    public void deleteUser(User user);

    public List<User> listUsers();

    public User getUserById(Long id);

    public void updateUser(User user);

    /*
     * Number of days after registration of user
     * */
    long usingDays(long userId);

    /*
     * Get user by login and pass
     * */
    User getUserByCredentials(String login, String pass);

    /**
     * @param userId
     * @param newPass
     * @implNote updates pass and stores new data to db
     */
    void changePassword(long userId, String newPass);


}
