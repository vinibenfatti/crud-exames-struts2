package org.apache.struts.edit.enums;

public enum ExamRepositoryEnum {

    INSERT_INTO_EXAME("INSERT INTO exame (nm_exame, ic_ativo, ds_detalhe_exame) VALUES (?, ?, ?)"),
    DELETE_EXAME("UPDATE exame SET ic_ativo = false WHERE cd_exame = ?"),
    UPDATE_EXAME("UPDATE exame SET nm_exame = ?, ds_detalhe_exame = ? WHERE cd_exame = ?"),
    SELECT_ACTIVE_EXAME_LIMITED_10("SELECT * FROM exame WHERE ic_ativo = true ORDER BY cd_exame DESC LIMIT 10"),
    FIND_BY_CD_EXAME("SELECT * FROM exame WHERE cd_exame = ?");

    String query;

    ExamRepositoryEnum(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
