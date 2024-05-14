package org.apache.struts.edit.repositories;

import org.apache.struts.edit.models.Exam;

import java.util.List;

public interface ExamRepository {

    Exam findByCdExame(Long cdExame);

    void persistExam(Exam exam);

    void deleteExam(Exam exam);

    List<Exam> getAllActiveExams();

    void updateExam(Exam exam);
}
