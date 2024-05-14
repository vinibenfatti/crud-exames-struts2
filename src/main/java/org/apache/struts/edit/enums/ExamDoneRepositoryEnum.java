package org.apache.struts.edit.enums;

public enum ExamDoneRepositoryEnum {

    SELECT_ALL_EXAM_DONE("SELECT * FROM exame_realizado er\n" +
            "INNER JOIN funcionario f ON er.cd_funcionario = f.cd_funcionario \n" +
            "INNER JOIN exame e ON er.cd_exame = e.cd_exame \n" +
            "WHERE e.ic_ativo = true\n" +
            "ORDER BY f.cd_funcionario DESC"),
    INSERT_INTO_EXAME_DONE("INSERT INTO exame_realizado (cd_exame, cd_funcionario, dt_realizacao) VALUES (?, ?, ?)"),

    SELECT_EXAM_DONE_BY_PERIOD("SELECT *\n" +
            "FROM exame_realizado er\n" +
            "INNER JOIN funcionario f ON er.cd_funcionario = f.cd_funcionario\n" +
            "INNER JOIN exame e ON er.cd_exame = e.cd_exame\n" +
            "WHERE e.ic_ativo = true\n" +
            "  AND er.dt_realizacao BETWEEN ? AND ?\n" +
            "ORDER BY f.cd_funcionario DESC");

    String query;

    ExamDoneRepositoryEnum(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
