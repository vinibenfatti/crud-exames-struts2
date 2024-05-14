package org.apache.struts.edit.actions.examDone;

import com.opensymphony.xwork2.ActionSupport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.struts.edit.models.Employee;
import org.apache.struts.edit.models.Exam;
import org.apache.struts.edit.models.ExamDone;
import org.apache.struts.edit.services.EmployeeService;
import org.apache.struts.edit.services.ExamDoneService;
import org.apache.struts.edit.services.ExamService;
import org.apache.struts.edit.services.impl.EmployeeServiceImpl;
import org.apache.struts.edit.services.impl.ExamDoneServiceImpl;
import org.apache.struts.edit.services.impl.ExamServiceImpl;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertExamDone extends ActionSupport {

    private ExamDoneService examDoneService = new ExamDoneServiceImpl();
    private ExamService examService = new ExamServiceImpl();
    private EmployeeService employeeService = new EmployeeServiceImpl();

    private List<Exam> exams;
    private List<Employee> employees;

    private ExamDone examDone;

    @Override
    public String input() {
        this.examDone = examDoneService.getExamDoneBean();
        this.exams = examService.getAllActiveExams();
        this.employees = employeeService.getAllEmployees();
        return INPUT;
    }

    public String execute() {
        examDoneService.saveExamDone(examDone);
        return SUCCESS;
    }
}
