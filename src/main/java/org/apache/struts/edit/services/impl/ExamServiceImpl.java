package org.apache.struts.edit.services.impl;

import org.apache.struts.edit.models.Exam;
import org.apache.struts.edit.repositories.ExamRepository;
import org.apache.struts.edit.repositories.impl.ExamRepositoryImpl;
import org.apache.struts.edit.services.ExamService;

import java.util.List;

import static org.apache.logging.log4j.util.Strings.isBlank;

public class ExamServiceImpl implements ExamService {
    private ExamRepository examRepository = new ExamRepositoryImpl();

    @Override
    public Exam getExamBean() {
        return new Exam();
    }

    @Override
    public void saveExam(Exam exam) {
        exam.setIc_ativo(true);
        examRepository.persistExam(exam);
    }

    @Override
    public void deleteExam(Exam exam) {
        examRepository.deleteExam(exam);
    }

    @Override
    public List<Exam> getAllActiveExams() {
        return examRepository.getAllActiveExams();
    }

    @Override
    public void updateExam(Exam exam) {
        Exam examFromDB = examRepository.findByCdExame(exam.getCd_exame());

        updateExamFieldIfNeed(exam, examFromDB);

        examRepository.updateExam(examFromDB);
    }

    private static void updateExamFieldIfNeed(Exam exam, Exam examFromDB) {
        examFromDB.setNm_exame(!isBlank(exam.getNm_exame()) ? exam.getNm_exame() : examFromDB.getNm_exame());
        examFromDB.setDs_detalhe_exame(!isBlank(exam.getDs_detalhe_exame()) ? exam.getDs_detalhe_exame() : examFromDB.getDs_detalhe_exame());
        examFromDB.setDs_detalhe_exame1(!isBlank(exam.getDs_detalhe_exame1()) ? exam.getDs_detalhe_exame1() : examFromDB.getDs_detalhe_exame1());
        examFromDB.setIc_ativo(true);
    }
}
