package org.apache.struts.edit.repositories;

import org.apache.struts.edit.models.ExamDone;

import java.sql.Date;
import java.util.List;

public interface ExamDoneRepository {
    List<ExamDone> getAllExamsDone();

    void saveExamDone(ExamDone examDone);

    List<ExamDone> getExamsDoneByPeriod(Date starDate, Date endDate);
}
