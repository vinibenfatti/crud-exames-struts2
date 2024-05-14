package org.apache.struts.edit.actions.examDone.report;

import com.opensymphony.xwork2.ActionSupport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.struts.edit.models.ExamDone;
import org.apache.struts.edit.resources.ExamDoneReportInput;
import org.apache.struts.edit.services.ExamDoneService;
import org.apache.struts.edit.services.impl.ExamDoneServiceImpl;

import java.util.List;
import java.util.logging.Logger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnExamDoneReport extends ActionSupport {

    private ExamDoneService examDoneService = new ExamDoneServiceImpl();

    private ExamDoneReportInput examDoneReportInput;

    private List<ExamDone> examsDone;

    @Override
    public String input() {
        this.examDoneReportInput = new ExamDoneReportInput();
        return INPUT;
    }

    @Override
    public String execute() {
        Logger logger = Logger.getLogger(ReturnExamDoneReport.class.getName());
        logger.info("StratDate " + examDoneReportInput.getStartDate());
        logger.info("EndDate " + examDoneReportInput.getEndDate());
        this.examsDone = examDoneService.getAllExamsDoneByPeriod(examDoneReportInput);
        logger.info("ExamsDone " + examsDone.toString());
        return SUCCESS;
    }


}
