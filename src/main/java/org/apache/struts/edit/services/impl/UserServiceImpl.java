package org.apache.struts.edit.services.impl;

import org.apache.struts.edit.models.User;
import org.apache.struts.edit.repositories.UserRepository;
import org.apache.struts.edit.repositories.impl.UserRepositoryImpl;
import org.apache.struts.edit.services.UserService;

import java.util.Base64;
import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository = new UserRepositoryImpl();
    @Override
    public List<User> getAllUsers() {
        List<User> users = this.userRepository.getAllUsers();
        users.forEach(user -> user.setDs_senha(decodePassword(user.getDs_senha())));
        return users;
    }

    @Override
    public void saveUser(User user) {
        user.setDs_senha(encodePassword(user.getDs_senha()));
        user.setQt_tempo_inatividade(0.0);
        this.userRepository.saveUser(user);
    }

    @Override
    public User getUserBean() {
        return new User();
    }

    @Override
    public void deleteUser(User user) {
        this.userRepository.deleteUser(user);
    }

    @Override
    public void updateUser(User user) {
        user.setDs_senha(encodePassword(user.getDs_senha()));
        this.userRepository.updateUser(user);
    }

    private String encodePassword(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }
    private String decodePassword(String encodedPassword) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedPassword);
        return new String(decodedBytes);
    }
}
