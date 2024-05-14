package org.apache.struts.edit.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
public class ExamDone {

    private Employee employee;

    private Exam exam;

    private Date dt_realizacao;

    public ExamDone() {
        this.employee = new Employee();
        this.exam = new Exam();
    }
}
