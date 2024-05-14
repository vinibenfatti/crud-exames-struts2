package org.apache.struts.edit.repositories.impl;

import org.apache.struts.edit.models.User;
import org.apache.struts.edit.repositories.UserRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.apache.struts.edit.enums.EmployeeRepositoryEnum.SELECT_ALL_EMPLOYEES;
import static org.apache.struts.edit.enums.ExamRepositoryEnum.INSERT_INTO_EXAME;
import static org.apache.struts.edit.enums.UserRepositoryEnum.DELETE_USER;
import static org.apache.struts.edit.enums.UserRepositoryEnum.INSERT_INTO_USER;
import static org.apache.struts.edit.enums.UserRepositoryEnum.SELECT_ALL_USERS;
import static org.apache.struts.edit.enums.UserRepositoryEnum.SELECT_USER_BY_CREDENTIALS;
import static org.apache.struts.edit.enums.UserRepositoryEnum.UPDATE_USER;


public class UserRepositoryImpl extends AbstractRepository implements UserRepository {
    @Override
    public void validateCredentials(String username, String password) {
        openConnection();
        PreparedStatement statement = preparedStatement(SELECT_USER_BY_CREDENTIALS.getQuery());
        try {
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            getUser(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> getAllUsers() {
        openConnection();
        ResultSet resultSet = getResultSet(SELECT_ALL_USERS.getQuery());
        return getUsers(resultSet);
    }

    @Override
    public void saveUser(User user) {
        openConnection();
            PreparedStatement statement = preparedStatement(INSERT_INTO_USER.getQuery());
        try {
            statement.setString(1, user.getNm_login());
            statement.setString(2, user.getDs_senha());
            statement.setDouble(3, user.getQt_tempo_inatividade());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteUser(User user) {
        openConnection();
        PreparedStatement statement = preparedStatement(DELETE_USER.getQuery());
        try {
            statement.setString(1, user.getNm_login());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateUser(User user) {
        openConnection();
        PreparedStatement statement = preparedStatement(UPDATE_USER.getQuery());
        try {
            statement.setString(2, user.getNm_login());
            statement.setString(1, user.getDs_senha());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<User> getUsers(ResultSet resultSet) {
        List<User> users = new ArrayList<>();
        try {
            while (resultSet.next()) {
                users.add(getUser(resultSet));
            }
            return users;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static User getUser(ResultSet resultSet) {
        try {
            User user = new User();
            user.setNm_login(resultSet.getString("nm_login"));
            user.setDs_senha(resultSet.getString("ds_senha"));
            user.setQt_tempo_inatividade(resultSet.getDouble("qt_tempo_inatividade"));
            return user;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
