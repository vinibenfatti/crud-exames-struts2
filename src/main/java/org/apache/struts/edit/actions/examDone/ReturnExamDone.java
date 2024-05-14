package org.apache.struts.edit.actions.examDone;

import com.opensymphony.xwork2.ActionSupport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.struts.edit.models.ExamDone;
import org.apache.struts.edit.services.ExamDoneService;
import org.apache.struts.edit.services.impl.ExamDoneServiceImpl;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnExamDone extends ActionSupport {

    private ExamDoneService examDoneService = new ExamDoneServiceImpl();

    private List<ExamDone> examsDone;

    @Override
    public String execute() {
        this.examsDone = examDoneService.getAllExamsDone();
        return SUCCESS;
    }
}
