package ru.gb.Homework5.repositiry;

import ru.gb.Homework5.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository  {

    private List<User> userList = new ArrayList<>();

    public void saveUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        System.out.println("пользователь удалён");
        userList.remove(user);
    }

    public void updateUser(int index, User user) {
        userList.set(index, user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public User getUser(String name) {
        for (User user : userList) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
}
