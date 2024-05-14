package org.apache.struts.edit.resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamDoneReportInput {

    private String startDate;
    private String endDate;
}
