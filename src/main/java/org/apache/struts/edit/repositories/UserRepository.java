package org.apache.struts.edit.repositories;

import org.apache.struts.edit.models.User;

import java.util.List;

public interface UserRepository {
    void validateCredentials(String username, String password);

    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(User user);

    void updateUser(User user);
}
