package Homework5.service;

import Homework5.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void removeUser(String user);

    void updateUser(int index, User user);

    void inDeposits(String name, Double cash);

    void outDeposits(String name, Double cash);

    List<User> getUserList();
}
