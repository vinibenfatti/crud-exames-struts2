package org.apache.struts.edit.repositories.impl;

import org.apache.struts.edit.models.Exam;
import org.apache.struts.edit.repositories.ExamRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.apache.struts.edit.enums.ExamRepositoryEnum.DELETE_EXAME;
import static org.apache.struts.edit.enums.ExamRepositoryEnum.FIND_BY_CD_EXAME;
import static org.apache.struts.edit.enums.ExamRepositoryEnum.INSERT_INTO_EXAME;
import static org.apache.struts.edit.enums.ExamRepositoryEnum.SELECT_ACTIVE_EXAME_LIMITED_10;
import static org.apache.struts.edit.enums.ExamRepositoryEnum.UPDATE_EXAME;

public class ExamRepositoryImpl extends AbstractRepository implements ExamRepository {

    @Override
    public Exam findByCdExame(Long cdExame) {
        openConnection();
        PreparedStatement statement = preparedStatement(FIND_BY_CD_EXAME.getQuery());
        try {
            statement.setLong(1, cdExame);
            ResultSet resultSet = statement.executeQuery();
            List<Exam> exams = new ArrayList<>();
            return getExams(resultSet, exams).get(0);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void persistExam(Exam exam) {
        openConnection();
        PreparedStatement statement = preparedStatement(INSERT_INTO_EXAME.getQuery());
        try {
            statement.setString(1, exam.getNm_exame());
            statement.setBoolean(2, exam.isIc_ativo());
            statement.setString(3, exam.getDs_detalhe_exame());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteExam(Exam exam) {
        openConnection();
        PreparedStatement statement = preparedStatement(DELETE_EXAME.getQuery());
        try {
            statement.setLong(1, exam.getCd_exame());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Exam> getAllActiveExams() {
        openConnection();
        ResultSet resultSet = getResultSet(SELECT_ACTIVE_EXAME_LIMITED_10.getQuery());

        List<Exam> exams = new ArrayList<>();

        return getExams(resultSet, exams);
    }

    @Override
    public void updateExam(Exam exam) {
        openConnection();
        PreparedStatement statement = preparedStatement(UPDATE_EXAME.getQuery());
        try {
            statement.setString(1, exam.getNm_exame());
            statement.setString(2, exam.getDs_detalhe_exame());
            statement.setLong(3, exam.getCd_exame());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Exam> getExams(ResultSet resultSet, List<Exam> exams) {
        try {
            while (resultSet.next()) {
                exams.add(getExam(resultSet));
            }
            return exams;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Exam getExam(ResultSet resultSet) {
        try {
            Exam exam = new Exam();
            exam.setCd_exame(resultSet.getLong("cd_exame"));
            exam.setNm_exame(resultSet.getString("nm_exame"));
            exam.setIc_ativo(resultSet.getBoolean("ic_ativo"));
            exam.setDs_detalhe_exame(resultSet.getString("ds_detalhe_exame"));
            exam.setDs_detalhe_exame1(resultSet.getString("ds_detalhe_exame1"));
            return exam;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
