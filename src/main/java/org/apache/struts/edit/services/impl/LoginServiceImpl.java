package org.apache.struts.edit.services.impl;

import org.apache.struts.edit.repositories.UserRepository;
import org.apache.struts.edit.repositories.impl.UserRepositoryImpl;
import org.apache.struts.edit.services.LoginService;

import java.util.Base64;

public class LoginServiceImpl implements LoginService {
   private UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void login(String username, String password) {
        this.userRepository.validateCredentials(username, encodePassword(password));
    }

    private String encodePassword(String password) {
        return Base64.getEncoder().encodeToString(password.getBytes());
    }
}
