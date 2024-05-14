package org.apache.struts.edit.enums;

public enum EmployeeRepositoryEnum {
    SELECT_ALL_EMPLOYEES("SELECT * FROM funcionario ORDER BY cd_funcionario DESC"),

    INSERT_INTO_EMPLOYEE("INSERT INTO funcionario (nm_funcionario) VALUES (?)"),

    DELETE_EMPLOYEE("DELETE FROM funcionario WHERE cd_funcionario = ?"),
    UPDATE_EMPLOYEE("UPDATE funcionario SET nm_funcionario = ? WHERE cd_funcionario = ?"),
    FIND_BY_CD_FUNCIONARIO("SELECT * FROM funcionario WHERE cd_funcionario = ?");

    String query;

    EmployeeRepositoryEnum(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
