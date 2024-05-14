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
public class DeleteExam extends ActionSupport {

    private ExamService examService = new ExamServiceImpl();

    private Exam exam;

    public String input() throws Exception {
        this.exam = examService.getExamBean();
        return INPUT;
    }

    @Override
    public String execute() throws Exception {
        examService.deleteExam(this.exam);
        return SUCCESS;
    }
}
