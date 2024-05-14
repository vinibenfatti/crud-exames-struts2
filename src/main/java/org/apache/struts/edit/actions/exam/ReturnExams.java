package org.apache.struts.edit.actions.exam;

import com.opensymphony.xwork2.ActionSupport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.struts.edit.models.Exam;
import org.apache.struts.edit.services.ExamService;
import org.apache.struts.edit.services.impl.ExamServiceImpl;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnExams extends ActionSupport {

    private ExamService examService = new ExamServiceImpl();

    private List<Exam> exams;

    @Override
    public String execute() {
        this.exams = examService.getAllActiveExams();
        return SUCCESS;
    }
}
