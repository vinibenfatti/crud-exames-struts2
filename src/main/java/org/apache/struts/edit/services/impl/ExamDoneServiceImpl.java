package org.apache.struts.edit.services.impl;

import org.apache.struts.edit.models.ExamDone;
import org.apache.struts.edit.repositories.ExamDoneRepository;
import org.apache.struts.edit.repositories.impl.ExamDoneRepositoryImpl;
import org.apache.struts.edit.resources.ExamDoneReportInput;
import org.apache.struts.edit.services.ExamDoneService;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class ExamDoneServiceImpl implements ExamDoneService {
    private ExamDoneRepository examDoneRepository = new ExamDoneRepositoryImpl();
    @Override
    public List<ExamDone> getAllExamsDone() {
        return this.examDoneRepository.getAllExamsDone();
    }

    @Override
    public ExamDone getExamDoneBean() {
        return new ExamDone();
    }

    @Override
    public void saveExamDone(ExamDone examDone) {
        this.examDoneRepository.saveExamDone(examDone);
    }

    @Override
    public List<ExamDone> getAllExamsDoneByPeriod(ExamDoneReportInput examDoneReportInput) {
        return this.examDoneRepository.getExamsDoneByPeriod(Date.valueOf(examDoneReportInput.getStartDate()),
                Date.valueOf(examDoneReportInput.getEndDate()));
    }
}
