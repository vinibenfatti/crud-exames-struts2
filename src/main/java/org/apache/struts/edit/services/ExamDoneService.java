package org.apache.struts.edit.services;

import org.apache.struts.edit.models.ExamDone;
import org.apache.struts.edit.resources.ExamDoneReportInput;

import java.util.List;

public interface ExamDoneService {
    List<ExamDone> getAllExamsDone();

    ExamDone getExamDoneBean();

    void saveExamDone(ExamDone examDone);

    List<ExamDone> getAllExamsDoneByPeriod(ExamDoneReportInput examDoneReportInput);
}
