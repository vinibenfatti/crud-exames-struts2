package org.apache.struts.edit.services;

import org.apache.struts.edit.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User getUserBean();

    void deleteUser(User user);

    void updateUser(User user);

    double saveInactiveTime(double inactiveTime);
}
