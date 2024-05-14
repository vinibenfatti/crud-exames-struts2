package org.apache.struts.edit.enums;

public enum UserRepositoryEnum {

    SELECT_USER_BY_CREDENTIALS("SELECT * FROM usuario \n" +
            "WHERE nm_login = ? AND ds_senha = ?"),

    SELECT_ALL_USERS("SELECT * FROM usuario"),
    INSERT_INTO_USER("INSERT INTO usuario (nm_login, ds_senha, qt_tempo_inatividade) VALUES (?, ?, ?)"),
    DELETE_USER("DELETE FROM usuario WHERE nm_login = ?");

    String query;

    UserRepositoryEnum(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
