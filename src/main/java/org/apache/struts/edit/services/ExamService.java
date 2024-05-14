package org.apache.struts.edit.services;

import org.apache.struts.edit.models.Exam;

import java.util.List;

public interface ExamService {

    Exam getExamBean();

    void saveExam(Exam exam);

    void deleteExam(Exam exam);

    List<Exam> getAllActiveExams();

    void updateExam(Exam exam);
}
