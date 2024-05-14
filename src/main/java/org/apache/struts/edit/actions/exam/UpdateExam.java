package org.apache.struts.edit.actions.exam;

import com.opensymphony.xwork2.ActionSupport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.struts.edit.models.Exam;
import org.apache.struts.edit.services.ExamService;
import org.apache.struts.edit.services.impl.ExamServiceImpl;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateExam extends ActionSupport {

    private ExamService examService = new ExamServiceImpl();

    private Exam exam;

    public String input() {
        this.exam = examService.getExamBean();
        return INPUT;
    }

    public String execute() {
        examService.updateExam(exam);
        return SUCCESS;
    }
}
