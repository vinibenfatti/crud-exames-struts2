package org.apache.struts.edit.repositories.impl;

import org.apache.struts.edit.models.Employee;
import org.apache.struts.edit.models.Exam;
import org.apache.struts.edit.models.ExamDone;
import org.apache.struts.edit.repositories.ExamDoneRepository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.apache.struts.edit.enums.ExamDoneRepositoryEnum.INSERT_INTO_EXAME_DONE;
import static org.apache.struts.edit.enums.ExamDoneRepositoryEnum.SELECT_ALL_EXAM_DONE;
import static org.apache.struts.edit.enums.ExamDoneRepositoryEnum.SELECT_EXAM_DONE_BY_PERIOD;
import static org.apache.struts.edit.enums.ExamRepositoryEnum.INSERT_INTO_EXAME;

public class ExamDoneRepositoryImpl extends AbstractRepository implements ExamDoneRepository {
    @Override
    public List<ExamDone> getAllExamsDone() {
        openConnection();
        ResultSet resultSet = getResultSet(SELECT_ALL_EXAM_DONE.getQuery());
        return getExamsTaken(resultSet);
    }

    @Override
    public void saveExamDone(ExamDone examDone) {
        openConnection();
        PreparedStatement statement = preparedStatement(INSERT_INTO_EXAME_DONE.getQuery());
        try {
            statement.setLong(1, examDone.getExam().getCd_exame());
            statement.setLong(2, examDone.getEmployee().getCd_funcionario());
            statement.setDate(3, examDone.getDt_realizacao());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<ExamDone> getExamsDoneByPeriod(Date starDate, Date endDate) {
        openConnection();
        PreparedStatement statement = preparedStatement(SELECT_EXAM_DONE_BY_PERIOD.getQuery());
        try {
            statement.setDate(1, starDate);
            statement.setDate(2, endDate);
            return getExamsTaken(statement.executeQuery());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<ExamDone> getExamsTaken(ResultSet resultSet) {
        List<ExamDone> examsTakens = new ArrayList<>();
        try {
            while (resultSet.next()) {
                examsTakens.add(getExamTaken(resultSet));
            }
            return examsTakens;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static ExamDone getExamTaken(ResultSet resultSet) {
        try {
            ExamDone examsTaken = new ExamDone();
            Exam exam = new Exam();
            Employee employee = new Employee();
            examsTaken.setEmployee(employee);
            examsTaken.setExam(exam);
            examsTaken.getEmployee().setCd_funcionario(resultSet.getLong("cd_funcionario"));
            examsTaken.getEmployee().setNm_funcionario(resultSet.getString("nm_funcionario"));
            examsTaken.getExam().setCd_exame(resultSet.getLong("cd_exame"));
            examsTaken.getExam().setNm_exame(resultSet.getString("nm_exame"));
            examsTaken.getExam().setIc_ativo(resultSet.getBoolean("ic_ativo"));
            examsTaken.getExam().setDs_detalhe_exame(resultSet.getString("ds_detalhe_exame"));
            examsTaken.getExam().setDs_detalhe_exame1(resultSet.getString("ds_detalhe_exame1"));
            examsTaken.setDt_realizacao(resultSet.getDate("dt_realizacao"));
            return examsTaken;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
