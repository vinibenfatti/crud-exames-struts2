package org.apache.struts.edit.repositories.impl;

import org.apache.struts.edit.configurations.DatabaseConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractRepository {

    private DatabaseConfig databaseConfig = new DatabaseConfig();
    private Connection connection;

    protected void openConnection(){
        this.connection = this.databaseConfig.getConnection();
    }

    protected PreparedStatement preparedStatement(String sqlQuery){
        try {
            return this.connection.prepareStatement(sqlQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    protected ResultSet getResultSet(String sqlQuery) {
        try{
            return this.connection.createStatement().executeQuery(sqlQuery);
        }catch (SQLException e) {
            throw new RuntimeException(e);}
    }

}
